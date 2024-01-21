import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class61 {

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	private int anInt2260 = 65000;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!ie;")
	private Class35 aClass35_2 = null;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "Lclient!ie;")
	private Class35 aClass35_3 = null;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	private final int anInt2265;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ILclient!ie;Lclient!ie;I)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3) {
		this.aClass35_3 = arg1;
		this.anInt2260 = arg3;
		this.anInt2265 = arg0;
		this.aClass35_2 = arg2;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ[B)Z")
	public boolean method1359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class35 local6 = this.aClass35_3;
		synchronized (this.aClass35_3) {
			if (arg0 < 0 || arg0 > this.anInt2260) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method1362(arg2, true, arg0, arg1);
			if (!local33) {
				local33 = this.method1362(arg2, false, arg0, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[B")
	public byte[] method1361(@OriginalArg(0) int arg0) {
		@Pc(8) Class35 local8 = this.aClass35_3;
		synchronized (this.aClass35_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass35_2.method904()) {
					return null;
				}
				this.aClass35_2.method910((long) (arg0 * 6));
				this.aClass35_2.method909(0, 6, Static79.aByteArray31);
				@Pc(69) int local69 = (Static79.aByteArray31[5] & 0xFF) + ((Static79.aByteArray31[3] & 0xFF) << 16) + ((Static79.aByteArray31[4] & 0xFF) << 8);
				@Pc(91) int local91 = (Static79.aByteArray31[2] & 0xFF) + ((Static79.aByteArray31[1] & 0xFF) << 8) + ((Static79.aByteArray31[0] & 0xFF) << 16);
				if (local91 < 0 || this.anInt2260 < local91) {
					return null;
				} else if (local69 > 0 && this.aClass35_3.method904() / 520L >= (long) local69) {
					@Pc(135) byte[] local135 = new byte[local91];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local139 < local91) {
						if (local69 == 0) {
							return null;
						}
						this.aClass35_3.method910((long) (local69 * 520));
						@Pc(176) int local176 = local91 - local139;
						if (local176 > 512) {
							local176 = 512;
						}
						this.aClass35_3.method909(0, local176 + 8, Static79.aByteArray31);
						@Pc(207) int local207 = ((Static79.aByteArray31[0] & 0xFF) << 8) + (Static79.aByteArray31[1] & 0xFF);
						@Pc(221) int local221 = ((Static79.aByteArray31[2] & 0xFF) << 8) + (Static79.aByteArray31[3] & 0xFF);
						@Pc(243) int local243 = (Static79.aByteArray31[6] & 0xFF) + ((Static79.aByteArray31[5] & 0xFF) << 8) + ((Static79.aByteArray31[4] & 0xFF) << 16);
						@Pc(249) int local249 = Static79.aByteArray31[7] & 0xFF;
						if (local207 == arg0 && local221 == local137 && this.anInt2265 == local249) {
							if (local243 >= 0 && (long) local243 <= this.aClass35_3.method904() / 520L) {
								for (@Pc(300) int local300 = 0; local300 < local176; local300++) {
									local135[local139++] = Static79.aByteArray31[local300 + 8];
								}
								local137++;
								local69 = local243;
								continue;
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(336) IOException local336) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[BZII)Z")
	private boolean method1362(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class35 local8 = this.aClass35_3;
		synchronized (this.aClass35_3) {
			try {
				@Pc(71) int local71;
				if (arg1) {
					if ((long) (arg3 * 6 + 6) > this.aClass35_2.method904()) {
						return false;
					}
					this.aClass35_2.method910((long) (arg3 * 6));
					this.aClass35_2.method909(0, 6, Static79.aByteArray31);
					local71 = (Static79.aByteArray31[5] & 0xFF) + ((Static79.aByteArray31[4] & 0xFF) << 8) + ((Static79.aByteArray31[3] & 0xFF) << 16);
					if (local71 <= 0 || this.aClass35_3.method904() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass35_3.method904() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static79.aByteArray31[2] = (byte) arg2;
				Static79.aByteArray31[0] = (byte) (arg2 >> 16);
				@Pc(123) int local123 = 0;
				Static79.aByteArray31[4] = (byte) (local71 >> 8);
				Static79.aByteArray31[1] = (byte) (arg2 >> 8);
				Static79.aByteArray31[5] = (byte) local71;
				@Pc(144) int local144 = 0;
				Static79.aByteArray31[3] = (byte) (local71 >> 16);
				this.aClass35_2.method910((long) (arg3 * 6));
				this.aClass35_2.method908(6, 0, Static79.aByteArray31);
				while (local123 < arg2) {
					@Pc(170) int local170 = 0;
					@Pc(205) int local205;
					if (arg1) {
						this.aClass35_3.method910((long) (local71 * 520));
						try {
							this.aClass35_3.method909(0, 8, Static79.aByteArray31);
						} catch (@Pc(189) EOFException local189) {
							return true;
						}
						local205 = (Static79.aByteArray31[1] & 0xFF) + ((Static79.aByteArray31[0] & 0xFF) << 8);
						local170 = (Static79.aByteArray31[6] & 0xFF) + ((Static79.aByteArray31[4] & 0xFF) << 16) + ((Static79.aByteArray31[5] & 0xFF) << 8);
						@Pc(242) int local242 = ((Static79.aByteArray31[2] & 0xFF) << 8) + (Static79.aByteArray31[3] & 0xFF);
						@Pc(248) int local248 = Static79.aByteArray31[7] & 0xFF;
						if (arg3 != local205 || local242 != local144 || this.anInt2265 != local248) {
							return false;
						}
						if (local170 < 0 || (long) local170 > this.aClass35_3.method904() / 520L) {
							return false;
						}
					}
					if (local170 == 0) {
						arg1 = false;
						local170 = (int) ((this.aClass35_3.method904() + 519L) / 520L);
						if (local170 == 0) {
							local170++;
						}
						if (local170 == local71) {
							local170++;
						}
					}
					Static79.aByteArray31[1] = (byte) arg3;
					Static79.aByteArray31[0] = (byte) (arg3 >> 8);
					if (arg2 - local123 <= 512) {
						local170 = 0;
					}
					Static79.aByteArray31[7] = (byte) this.anInt2265;
					Static79.aByteArray31[3] = (byte) local144;
					Static79.aByteArray31[6] = (byte) local170;
					local205 = arg2 - local123;
					Static79.aByteArray31[2] = (byte) (local144 >> 8);
					if (local205 > 512) {
						local205 = 512;
					}
					local144++;
					Static79.aByteArray31[5] = (byte) (local170 >> 8);
					Static79.aByteArray31[4] = (byte) (local170 >> 16);
					this.aClass35_3.method910((long) (local71 * 520));
					local71 = local170;
					this.aClass35_3.method908(8, 0, Static79.aByteArray31);
					this.aClass35_3.method908(local205, local123, arg0);
					local123 += local205;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2265;
	}
}
