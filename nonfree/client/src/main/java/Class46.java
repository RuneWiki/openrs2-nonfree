import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class46 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	private int anInt1941 = 65000;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Lclient!d;")
	private Class13 aClass13_4 = null;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!d;")
	private Class13 aClass13_3 = null;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	private final int anInt1934;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILclient!d;Lclient!d;I)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3) {
		this.anInt1934 = arg0;
		this.aClass13_4 = arg1;
		this.anInt1941 = arg3;
		this.aClass13_3 = arg2;
	}

	@OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1934;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[BI)Z")
	public boolean method1177(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class13 local10 = this.aClass13_4;
		synchronized (this.aClass13_4) {
			if (arg0 < 0 || this.anInt1941 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method1178(arg0, arg2, arg1, true);
			if (!local33) {
				local33 = this.method1178(arg0, arg2, arg1, false);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII[BZ)Z")
	private boolean method1178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class13 local8 = this.aClass13_4;
		synchronized (this.aClass13_4) {
			try {
				@Pc(68) int local68;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass13_3.method375()) {
						return false;
					}
					this.aClass13_3.method381((long) (arg1 * 6));
					this.aClass13_3.method379(6, 0, Static58.aByteArray17);
					local68 = ((Static58.aByteArray17[4] & 0xFF) << 8) + ((Static58.aByteArray17[3] & 0xFF) << 16) + (Static58.aByteArray17[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aClass13_4.method375() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass13_4.method375() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				@Pc(114) int local114 = 0;
				Static58.aByteArray17[0] = (byte) (arg0 >> 16);
				@Pc(123) int local123 = 0;
				Static58.aByteArray17[1] = (byte) (arg0 >> 8);
				Static58.aByteArray17[2] = (byte) arg0;
				Static58.aByteArray17[3] = (byte) (local68 >> 16);
				Static58.aByteArray17[4] = (byte) (local68 >> 8);
				Static58.aByteArray17[5] = (byte) local68;
				this.aClass13_3.method381((long) (arg1 * 6));
				this.aClass13_3.method374(Static58.aByteArray17, 6, 0);
				while (local114 < arg0) {
					@Pc(173) int local173 = 0;
					@Pc(246) int local246;
					if (arg3) {
						this.aClass13_4.method381((long) (local68 * 520));
						try {
							this.aClass13_4.method379(8, 0, Static58.aByteArray17);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local173 = (Static58.aByteArray17[6] & 0xFF) + (((Static58.aByteArray17[4] & 0xFF) << 16) + ((Static58.aByteArray17[5] & 0xFF) << 8));
						@Pc(232) int local232 = ((Static58.aByteArray17[2] & 0xFF) << 8) + (Static58.aByteArray17[3] & 0xFF);
						local246 = ((Static58.aByteArray17[0] & 0xFF) << 8) + (Static58.aByteArray17[1] & 0xFF);
						@Pc(252) int local252 = Static58.aByteArray17[7] & 0xFF;
						if (arg1 != local246 || local232 != local123 || local252 != this.anInt1934) {
							return false;
						}
						if (local173 < 0 || (long) local173 > this.aClass13_4.method375() / 520L) {
							return false;
						}
					}
					if (local173 == 0) {
						arg3 = false;
						local173 = (int) ((this.aClass13_4.method375() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local68) {
							local173++;
						}
					}
					if (arg0 - local114 <= 512) {
						local173 = 0;
					}
					Static58.aByteArray17[0] = (byte) (arg1 >> 8);
					Static58.aByteArray17[1] = (byte) arg1;
					local246 = arg0 - local114;
					if (local246 > 512) {
						local246 = 512;
					}
					Static58.aByteArray17[2] = (byte) (local123 >> 8);
					Static58.aByteArray17[3] = (byte) local123;
					Static58.aByteArray17[4] = (byte) (local173 >> 16);
					local123++;
					Static58.aByteArray17[5] = (byte) (local173 >> 8);
					Static58.aByteArray17[6] = (byte) local173;
					Static58.aByteArray17[7] = (byte) this.anInt1934;
					this.aClass13_4.method381((long) (local68 * 520));
					local68 = local173;
					this.aClass13_4.method374(Static58.aByteArray17, 8, 0);
					this.aClass13_4.method374(arg2, local246, local114);
					local114 += local246;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[B")
	public byte[] method1179(@OriginalArg(0) int arg0) {
		@Pc(8) Class13 local8 = this.aClass13_4;
		synchronized (this.aClass13_4) {
			try {
				if (this.aClass13_3.method375() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass13_3.method381((long) (arg0 * 6));
				this.aClass13_3.method379(6, 0, Static58.aByteArray17);
				@Pc(74) int local74 = (Static58.aByteArray17[5] & 0xFF) + ((Static58.aByteArray17[4] & 0xFF) << 8) + ((Static58.aByteArray17[3] & 0xFF) << 16);
				@Pc(96) int local96 = (Static58.aByteArray17[2] & 0xFF) + ((Static58.aByteArray17[1] & 0xFF) << 8) + ((Static58.aByteArray17[0] & 0xFF) << 16);
				if (local96 < 0 || local96 > this.anInt1941) {
					return null;
				} else if (local74 > 0 && this.aClass13_4.method375() / 520L >= (long) local74) {
					@Pc(136) byte[] local136 = new byte[local96];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					label55: while (local96 > local138) {
						if (local74 == 0) {
							return null;
						}
						this.aClass13_4.method381((long) (local74 * 520));
						@Pc(162) int local162 = local96 - local138;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass13_4.method379(local162 + 8, 0, Static58.aByteArray17);
						@Pc(193) int local193 = ((Static58.aByteArray17[0] & 0xFF) << 8) + (Static58.aByteArray17[1] & 0xFF);
						@Pc(216) int local216 = ((Static58.aByteArray17[4] & 0xFF) << 16) + ((Static58.aByteArray17[5] & 0xFF) << 8) + (Static58.aByteArray17[6] & 0xFF);
						@Pc(230) int local230 = (Static58.aByteArray17[3] & 0xFF) + ((Static58.aByteArray17[2] & 0xFF) << 8);
						@Pc(236) int local236 = Static58.aByteArray17[7] & 0xFF;
						if (arg0 == local193 && local140 == local230 && local236 == this.anInt1934) {
							if (local216 >= 0 && this.aClass13_4.method375() / 520L >= (long) local216) {
								local74 = local216;
								local140++;
								@Pc(286) int local286 = 0;
								while (true) {
									if (local162 <= local286) {
										continue label55;
									}
									local136[local138++] = Static58.aByteArray17[local286 + 8];
									local286++;
								}
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(311) IOException local311) {
				return null;
			}
		}
	}
}
