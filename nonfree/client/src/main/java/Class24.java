import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class24 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	private int anInt735 = 65000;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!r;")
	private Class70 aClass70_1 = null;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!r;")
	private Class70 aClass70_2 = null;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	private final int anInt746;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(ILclient!r;Lclient!r;I)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) int arg3) {
		this.anInt735 = arg3;
		this.anInt746 = arg0;
		this.aClass70_2 = arg2;
		this.aClass70_1 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method605(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class70 local8 = this.aClass70_1;
		synchronized (this.aClass70_1) {
			try {
				@Pc(71) int local71;
				if (arg3) {
					if (this.aClass70_2.method1611() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass70_2.method1607((long) (arg2 * 6));
					this.aClass70_2.method1617(Static41.aByteArray17, 0, 6);
					local71 = ((Static41.aByteArray17[3] & 0xFF) << 16) + (Static41.aByteArray17[4] << 8 & 0xFF00) + (Static41.aByteArray17[5] & 0xFF);
					if (local71 <= 0 || this.aClass70_1.method1611() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass70_1.method1611() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static41.aByteArray17[0] = (byte) (arg1 >> 16);
				Static41.aByteArray17[2] = (byte) arg1;
				Static41.aByteArray17[1] = (byte) (arg1 >> 8);
				@Pc(128) int local128 = 0;
				Static41.aByteArray17[5] = (byte) local71;
				Static41.aByteArray17[3] = (byte) (local71 >> 16);
				Static41.aByteArray17[4] = (byte) (local71 >> 8);
				@Pc(149) int local149 = 0;
				this.aClass70_2.method1607((long) (arg2 * 6));
				this.aClass70_2.method1609(0, 6, Static41.aByteArray17);
				while (arg1 > local128) {
					@Pc(170) int local170 = 0;
					@Pc(231) int local231;
					if (arg3) {
						this.aClass70_1.method1607((long) (local71 * 520));
						try {
							this.aClass70_1.method1617(Static41.aByteArray17, 0, 8);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local170 = ((Static41.aByteArray17[4] & 0xFF) << 16) + ((Static41.aByteArray17[5] & 0xFF) << 8) + (Static41.aByteArray17[6] & 0xFF);
						local231 = (Static41.aByteArray17[1] & 0xFF) + ((Static41.aByteArray17[0] & 0xFF) << 8);
						@Pc(245) int local245 = (Static41.aByteArray17[3] & 0xFF) + ((Static41.aByteArray17[2] & 0xFF) << 8);
						@Pc(251) int local251 = Static41.aByteArray17[7] & 0xFF;
						if (arg2 != local231 || local245 != local149 || this.anInt746 != local251) {
							return false;
						}
						if (local170 < 0 || (long) local170 > this.aClass70_1.method1611() / 520L) {
							return false;
						}
					}
					local231 = arg1 - local128;
					if (local170 == 0) {
						arg3 = false;
						local170 = (int) ((this.aClass70_1.method1611() + 519L) / 520L);
						if (local170 == 0) {
							local170++;
						}
						if (local170 == local71) {
							local170++;
						}
					}
					Static41.aByteArray17[1] = (byte) arg2;
					Static41.aByteArray17[2] = (byte) (local149 >> 8);
					Static41.aByteArray17[7] = (byte) this.anInt746;
					Static41.aByteArray17[3] = (byte) local149;
					if (arg1 - local128 <= 512) {
						local170 = 0;
					}
					Static41.aByteArray17[5] = (byte) (local170 >> 8);
					Static41.aByteArray17[4] = (byte) (local170 >> 16);
					if (local231 > 512) {
						local231 = 512;
					}
					Static41.aByteArray17[0] = (byte) (arg2 >> 8);
					Static41.aByteArray17[6] = (byte) local170;
					local149++;
					this.aClass70_1.method1607((long) (local71 * 520));
					local71 = local170;
					this.aClass70_1.method1609(0, 8, Static41.aByteArray17);
					this.aClass70_1.method1609(local128, local231, arg0);
					local128 += local231;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt746;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z[BII)Z")
	public boolean method608(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class70 local6 = this.aClass70_1;
		synchronized (this.aClass70_1) {
			if (arg1 < 0 || this.anInt735 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(26) boolean local26 = this.method605(arg0, arg1, arg2, true);
			if (!local26) {
				local26 = this.method605(arg0, arg1, arg2, false);
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[B")
	public byte[] method609(@OriginalArg(0) int arg0) {
		@Pc(8) Class70 local8 = this.aClass70_1;
		synchronized (this.aClass70_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass70_2.method1611()) {
					return null;
				}
				this.aClass70_2.method1607((long) (arg0 * 6));
				this.aClass70_2.method1617(Static41.aByteArray17, 0, 6);
				@Pc(75) int local75 = ((Static41.aByteArray17[1] & 0xFF) << 8) + (((Static41.aByteArray17[0] & 0xFF) << 16) + (Static41.aByteArray17[2] & 0xFF));
				@Pc(98) int local98 = (Static41.aByteArray17[5] & 0xFF) + ((Static41.aByteArray17[3] & 0xFF) << 16) + ((Static41.aByteArray17[4] & 0xFF) << 8);
				if (local75 < 0 || this.anInt735 < local75) {
					return null;
				} else if (local98 > 0 && (long) local98 <= this.aClass70_1.method1611() / 520L) {
					@Pc(144) int local144 = 0;
					@Pc(147) byte[] local147 = new byte[local75];
					@Pc(149) int local149 = 0;
					label55: while (local75 > local149) {
						if (local98 == 0) {
							return null;
						}
						this.aClass70_1.method1607((long) (local98 * 520));
						@Pc(171) int local171 = local75 - local149;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass70_1.method1617(Static41.aByteArray17, 0, local171 + 8);
						@Pc(210) int local210 = ((Static41.aByteArray17[5] & 0xFF) << 8) + ((Static41.aByteArray17[4] & 0xFF) << 16) + (Static41.aByteArray17[6] & 0xFF);
						@Pc(216) int local216 = Static41.aByteArray17[7] & 0xFF;
						@Pc(230) int local230 = (Static41.aByteArray17[1] & 0xFF) + ((Static41.aByteArray17[0] & 0xFF) << 8);
						@Pc(244) int local244 = (Static41.aByteArray17[3] & 0xFF) + ((Static41.aByteArray17[2] & 0xFF) << 8);
						if (arg0 == local230 && local144 == local244 && local216 == this.anInt746) {
							if (local210 >= 0 && (long) local210 <= this.aClass70_1.method1611() / 520L) {
								local144++;
								local98 = local210;
								@Pc(299) int local299 = 0;
								while (true) {
									if (local299 >= local171) {
										continue label55;
									}
									local147[local149++] = Static41.aByteArray17[local299 + 8];
									local299++;
								}
							}
							return null;
						}
						return null;
					}
					return local147;
				} else {
					return null;
				}
			} catch (@Pc(324) IOException local324) {
				return null;
			}
		}
	}
}
