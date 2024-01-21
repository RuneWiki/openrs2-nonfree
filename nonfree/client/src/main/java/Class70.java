import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class70 {

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!ca;")
	private Class12 aClass12_48 = null;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!ca;")
	private Class12 aClass12_49 = null;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	private int anInt2390 = 65000;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
	private final int anInt2380;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ILclient!ca;Lclient!ca;I)V")
	public Class70(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) int arg3) {
		this.anInt2380 = arg0;
		this.aClass12_49 = arg2;
		this.aClass12_48 = arg1;
		this.anInt2390 = arg3;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method1691(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class12 local8 = this.aClass12_48;
		synchronized (this.aClass12_48) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if (this.aClass12_49.method356() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass12_49.method357((long) (arg2 * 6));
					this.aClass12_49.method350(6, 0, Static116.aByteArray33);
					local22 = (Static116.aByteArray33[5] & 0xFF) + ((Static116.aByteArray33[3] & 0xFF) << 16) + ((Static116.aByteArray33[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass12_48.method356() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass12_48.method356() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static116.aByteArray33[0] = (byte) (arg0 >> 16);
				@Pc(124) int local124 = 0;
				Static116.aByteArray33[5] = (byte) local22;
				Static116.aByteArray33[1] = (byte) (arg0 >> 8);
				Static116.aByteArray33[4] = (byte) (local22 >> 8);
				Static116.aByteArray33[3] = (byte) (local22 >> 16);
				Static116.aByteArray33[2] = (byte) arg0;
				this.aClass12_49.method357((long) (arg2 * 6));
				@Pc(165) int local165 = 0;
				this.aClass12_49.method354(Static116.aByteArray33, 6, 0);
				while (arg0 > local124) {
					@Pc(181) int local181 = 0;
					@Pc(254) int local254;
					if (arg3) {
						this.aClass12_48.method357((long) (local22 * 520));
						try {
							this.aClass12_48.method350(8, 0, Static116.aByteArray33);
						} catch (@Pc(200) EOFException local200) {
							return true;
						}
						local181 = (Static116.aByteArray33[6] & 0xFF) + ((Static116.aByteArray33[4] & 0xFF) << 16) + ((Static116.aByteArray33[5] & 0xFF) << 8);
						@Pc(240) int local240 = ((Static116.aByteArray33[2] & 0xFF) << 8) + (Static116.aByteArray33[3] & 0xFF);
						local254 = (Static116.aByteArray33[1] & 0xFF) + ((Static116.aByteArray33[0] & 0xFF) << 8);
						@Pc(260) int local260 = Static116.aByteArray33[7] & 0xFF;
						if (arg2 != local254 || local240 != local165 || this.anInt2380 != local260) {
							return false;
						}
						if (local181 < 0 || this.aClass12_48.method356() / 520L < (long) local181) {
							return false;
						}
					}
					if (local181 == 0) {
						local181 = (int) ((this.aClass12_48.method356() + 519L) / 520L);
						arg3 = false;
						if (local181 == 0) {
							local181++;
						}
						if (local22 == local181) {
							local181++;
						}
					}
					Static116.aByteArray33[0] = (byte) (arg2 >> 8);
					Static116.aByteArray33[1] = (byte) arg2;
					local254 = arg0 - local124;
					Static116.aByteArray33[3] = (byte) local165;
					if (local254 > 512) {
						local254 = 512;
					}
					if (arg0 - local124 <= 512) {
						local181 = 0;
					}
					Static116.aByteArray33[5] = (byte) (local181 >> 8);
					Static116.aByteArray33[6] = (byte) local181;
					Static116.aByteArray33[4] = (byte) (local181 >> 16);
					Static116.aByteArray33[2] = (byte) (local165 >> 8);
					Static116.aByteArray33[7] = (byte) this.anInt2380;
					this.aClass12_48.method357((long) (local22 * 520));
					local165++;
					local22 = local181;
					this.aClass12_48.method354(Static116.aByteArray33, 8, 0);
					this.aClass12_48.method354(arg1, local254, local124);
					local124 += local254;
				}
				return true;
			} catch (@Pc(450) IOException local450) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[B")
	public byte[] method1692(@OriginalArg(1) int arg0) {
		@Pc(8) Class12 local8 = this.aClass12_48;
		synchronized (this.aClass12_48) {
			try {
				if (this.aClass12_49.method356() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass12_49.method357((long) (arg0 * 6));
				this.aClass12_49.method350(6, 0, Static116.aByteArray33);
				@Pc(69) int local69 = ((Static116.aByteArray33[1] & 0xFF) << 8) + ((Static116.aByteArray33[0] & 0xFF) << 16) + (Static116.aByteArray33[2] & 0xFF);
				@Pc(91) int local91 = (Static116.aByteArray33[5] & 0xFF) + ((Static116.aByteArray33[3] & 0xFF) << 16) + ((Static116.aByteArray33[4] & 0xFF) << 8);
				if (local69 < 0 || this.anInt2390 < local69) {
					return null;
				} else if (local91 > 0 && this.aClass12_48.method356() / 520L >= (long) local91) {
					@Pc(136) byte[] local136 = new byte[local69];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					while (local69 > local138) {
						if (local91 == 0) {
							return null;
						}
						this.aClass12_48.method357((long) (local91 * 520));
						@Pc(163) int local163 = local69 - local138;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass12_48.method350(local163 + 8, 0, Static116.aByteArray33);
						@Pc(185) int local185 = Static116.aByteArray33[7] & 0xFF;
						@Pc(207) int local207 = (Static116.aByteArray33[6] & 0xFF) + ((Static116.aByteArray33[5] & 0xFF) << 8) + ((Static116.aByteArray33[4] & 0xFF) << 16);
						@Pc(222) int local222 = ((Static116.aByteArray33[2] & 0xFF) << 8) + (Static116.aByteArray33[3] & 0xFF);
						@Pc(236) int local236 = (Static116.aByteArray33[1] & 0xFF) + ((Static116.aByteArray33[0] & 0xFF) << 8);
						if (local236 == arg0 && local140 == local222 && this.anInt2380 == local185) {
							if (local207 >= 0 && this.aClass12_48.method356() / 520L >= (long) local207) {
								local91 = local207;
								for (@Pc(286) int local286 = 0; local286 < local163; local286++) {
									local136[local138++] = Static116.aByteArray33[local286 + 8];
								}
								local140++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(320) IOException local320) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2380;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BII)Z")
	public boolean method1694(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class12 local6 = this.aClass12_48;
		synchronized (this.aClass12_48) {
			if (arg0 < 0 || arg0 > this.anInt2390) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method1691(arg0, arg1, arg2, true);
			if (!local33) {
				local33 = this.method1691(arg0, arg1, arg2, false);
			}
			return local33;
		}
	}
}
