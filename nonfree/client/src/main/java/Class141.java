import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class141 {

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	private int anInt3797 = 65000;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!je;")
	private Class124 aClass124_2 = null;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Lclient!je;")
	private Class124 aClass124_3 = null;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	private final int anInt3794;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(ILclient!je;Lclient!je;I)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) int arg3) {
		this.aClass124_2 = arg2;
		this.anInt3794 = arg0;
		this.aClass124_3 = arg1;
		this.anInt3797 = arg3;
	}

	@OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3794;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)[B")
	public byte[] method3193(@OriginalArg(1) int arg0) {
		@Pc(8) Class124 local8 = this.aClass124_3;
		synchronized (this.aClass124_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass124_2.method2952()) {
					return null;
				}
				this.aClass124_2.method2949((long) (arg0 * 6));
				this.aClass124_2.method2951(0, 6, Static427.aByteArray87);
				@Pc(70) int local70 = (Static427.aByteArray87[2] & 0xFF) + (((Static427.aByteArray87[0] & 0xFF) << 16) + ((Static427.aByteArray87[1] & 0xFF) << 8));
				@Pc(92) int local92 = (Static427.aByteArray87[5] & 0xFF) + ((Static427.aByteArray87[4] & 0xFF) << 8) + ((Static427.aByteArray87[3] & 0xFF) << 16);
				if (local70 < 0 || local70 > this.anInt3797) {
					return null;
				} else if (local92 > 0 && (long) local92 <= this.aClass124_3.method2952() / 520L) {
					@Pc(125) byte[] local125 = new byte[local70];
					@Pc(127) int local127 = 0;
					@Pc(137) int local137 = 0;
					label55: while (local127 < local70) {
						if (local92 == 0) {
							return null;
						}
						this.aClass124_3.method2949((long) (local92 * 520));
						@Pc(163) int local163 = local70 - local127;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass124_3.method2951(0, local163 + 8, Static427.aByteArray87);
						@Pc(192) int local192 = ((Static427.aByteArray87[0] & 0xFF) << 8) + (Static427.aByteArray87[1] & 0xFF);
						@Pc(207) int local207 = ((Static427.aByteArray87[2] & 0xFF) << 8) + (Static427.aByteArray87[3] & 0xFF);
						@Pc(229) int local229 = (Static427.aByteArray87[6] & 0xFF) + ((Static427.aByteArray87[5] & 0xFF) << 8) + ((Static427.aByteArray87[4] & 0xFF) << 16);
						@Pc(235) int local235 = Static427.aByteArray87[7] & 0xFF;
						if (arg0 == local192 && local137 == local207 && local235 == this.anInt3794) {
							if (local229 >= 0 && (long) local229 <= this.aClass124_3.method2952() / 520L) {
								local92 = local229;
								local137++;
								@Pc(274) int local274 = 0;
								while (true) {
									if (local163 <= local274) {
										continue label55;
									}
									local125[local127++] = Static427.aByteArray87[local274 + 8];
									local274++;
								}
							}
							return null;
						}
						return null;
					}
					return local125;
				} else {
					return null;
				}
			} catch (@Pc(303) IOException local303) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B[BIIZ)Z")
	private boolean method3194(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class124 local8 = this.aClass124_3;
		synchronized (this.aClass124_3) {
			try {
				@Pc(27) int local27;
				if (arg3) {
					if (this.aClass124_2.method2952() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass124_2.method2949((long) (arg2 * 6));
					this.aClass124_2.method2951(0, 6, Static427.aByteArray87);
					local27 = ((Static427.aByteArray87[3] & 0xFF) << 16) + (Static427.aByteArray87[4] << 8 & 0xFF00) + (Static427.aByteArray87[5] & 0xFF);
					if (local27 <= 0 || (long) local27 > this.aClass124_3.method2952() / 520L) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass124_3.method2952() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Static427.aByteArray87[4] = (byte) (local27 >> 8);
				Static427.aByteArray87[0] = (byte) (arg1 >> 16);
				Static427.aByteArray87[3] = (byte) (local27 >> 16);
				Static427.aByteArray87[2] = (byte) arg1;
				Static427.aByteArray87[5] = (byte) local27;
				Static427.aByteArray87[1] = (byte) (arg1 >> 8);
				this.aClass124_2.method2949((long) (arg2 * 6));
				this.aClass124_2.method2945(0, 6, Static427.aByteArray87);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (arg1 > local168) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg3) {
						this.aClass124_3.method2949((long) (local27 * 520));
						try {
							this.aClass124_3.method2951(0, 8, Static427.aByteArray87);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static427.aByteArray87[1] & 0xFF) + ((Static427.aByteArray87[0] & 0xFF) << 8);
						@Pc(223) int local223 = ((Static427.aByteArray87[2] & 0xFF) << 8) + (Static427.aByteArray87[3] & 0xFF);
						local174 = (Static427.aByteArray87[6] & 0xFF) + (((Static427.aByteArray87[4] & 0xFF) << 16) + ((Static427.aByteArray87[5] & 0xFF) << 8));
						@Pc(252) int local252 = Static427.aByteArray87[7] & 0xFF;
						if (local209 != arg2 || local223 != local170 || local252 != this.anInt3794) {
							return false;
						}
						if (local174 < 0 || this.aClass124_3.method2952() / 520L < (long) local174) {
							return false;
						}
					}
					if (local174 == 0) {
						local174 = (int) ((this.aClass124_3.method2952() + 519L) / 520L);
						arg3 = false;
						if (local174 == 0) {
							local174++;
						}
						if (local27 == local174) {
							local174++;
						}
					}
					Static427.aByteArray87[0] = (byte) (arg2 >> 8);
					Static427.aByteArray87[2] = (byte) (local170 >> 8);
					if (arg1 - local168 <= 512) {
						local174 = 0;
					}
					Static427.aByteArray87[3] = (byte) local170;
					Static427.aByteArray87[1] = (byte) arg2;
					Static427.aByteArray87[6] = (byte) local174;
					Static427.aByteArray87[7] = (byte) this.anInt3794;
					Static427.aByteArray87[4] = (byte) (local174 >> 16);
					Static427.aByteArray87[5] = (byte) (local174 >> 8);
					this.aClass124_3.method2949((long) (local27 * 520));
					this.aClass124_3.method2945(0, 8, Static427.aByteArray87);
					local209 = arg1 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass124_3.method2945(local168, local209, arg0);
					local27 = local174;
					local170++;
					local168 += local209;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II[BI)Z")
	public boolean method3195(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class124 local14 = this.aClass124_3;
		synchronized (this.aClass124_3) {
			if (arg0 < 0 || this.anInt3797 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method3194(arg1, arg0, arg2, true);
			if (!local38) {
				local38 = this.method3194(arg1, arg0, arg2, false);
			}
			return local38;
		}
	}
}
