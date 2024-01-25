import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class47 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!hga;")
	private Class141 aClass141_1 = null;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	private int anInt1363 = 65000;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!hga;")
	private Class141 aClass141_2 = null;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	private final int anInt1360;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILclient!hga;Lclient!hga;I)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class141 arg2, @OriginalArg(3) int arg3) {
		this.anInt1363 = arg3;
		this.anInt1360 = arg0;
		this.aClass141_1 = arg1;
		this.aClass141_2 = arg2;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[B")
	public byte[] method1301(@OriginalArg(1) int arg0) {
		@Pc(8) Class141 local8 = this.aClass141_1;
		synchronized (this.aClass141_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass141_2.method4078()) {
					return null;
				}
				this.aClass141_2.method4074((long) (arg0 * 6));
				this.aClass141_2.method4071(6, Static650.aByteArray102, 0);
				@Pc(72) int local72 = ((Static650.aByteArray102[1] & 0xFF) << 8) + (((Static650.aByteArray102[0] & 0xFF) << 16) + (Static650.aByteArray102[2] & 0xFF));
				@Pc(95) int local95 = ((Static650.aByteArray102[4] & 0xFF) << 8) + (((Static650.aByteArray102[3] & 0xFF) << 16) + (Static650.aByteArray102[5] & 0xFF));
				if (local72 < 0 || this.anInt1363 < local72) {
					return null;
				} else if (local95 > 0 && (long) local95 <= this.aClass141_1.method4078() / 520L) {
					@Pc(135) byte[] local135 = new byte[local72];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local72 > local137) {
						if (local95 == 0) {
							return null;
						}
						this.aClass141_1.method4074((long) (local95 * 520));
						@Pc(165) int local165 = local72 - local137;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass141_1.method4071(local165 + 8, Static650.aByteArray102, 0);
						@Pc(193) int local193 = (Static650.aByteArray102[1] & 0xFF) + ((Static650.aByteArray102[0] & 0xFF) << 8);
						@Pc(207) int local207 = (Static650.aByteArray102[3] & 0xFF) + ((Static650.aByteArray102[2] & 0xFF) << 8);
						@Pc(230) int local230 = ((Static650.aByteArray102[5] & 0xFF) << 8) + ((Static650.aByteArray102[4] << 16 & 0xFF0000) + (Static650.aByteArray102[6] & 0xFF));
						@Pc(236) int local236 = Static650.aByteArray102[7] & 0xFF;
						if (arg0 == local193 && local207 == local139 && this.anInt1360 == local236) {
							if (local230 >= 0 && this.aClass141_1.method4078() / 520L >= (long) local230) {
								local139++;
								for (@Pc(284) int local284 = 0; local284 < local165; local284++) {
									local135[local137++] = Static650.aByteArray102[local284 + 8];
								}
								local95 = local230;
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
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method1302(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class141 local13 = this.aClass141_1;
		synchronized (this.aClass141_1) {
			try {
				@Pc(27) int local27;
				if (arg0) {
					if (this.aClass141_2.method4078() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass141_2.method4074((long) (arg2 * 6));
					this.aClass141_2.method4071(6, Static650.aByteArray102, 0);
					local27 = (Static650.aByteArray102[5] & 0xFF) + (((Static650.aByteArray102[3] & 0xFF) << 16) + ((Static650.aByteArray102[4] & 0xFF) << 8));
					if (local27 <= 0 || (long) local27 > this.aClass141_1.method4078() / 520L) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass141_1.method4078() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Static650.aByteArray102[5] = (byte) local27;
				Static650.aByteArray102[4] = (byte) (local27 >> 8);
				Static650.aByteArray102[0] = (byte) (arg3 >> 16);
				Static650.aByteArray102[2] = (byte) arg3;
				Static650.aByteArray102[3] = (byte) (local27 >> 16);
				Static650.aByteArray102[1] = (byte) (arg3 >> 8);
				this.aClass141_2.method4074((long) (arg2 * 6));
				this.aClass141_2.method4075(6, 0, Static650.aByteArray102);
				@Pc(169) int local169 = 0;
				@Pc(171) int local171 = 0;
				while (local169 < arg3) {
					@Pc(175) int local175 = 0;
					@Pc(211) int local211;
					if (arg0) {
						this.aClass141_1.method4074((long) (local27 * 520));
						try {
							this.aClass141_1.method4071(8, Static650.aByteArray102, 0);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local211 = ((Static650.aByteArray102[0] & 0xFF) << 8) + (Static650.aByteArray102[1] & 0xFF);
						@Pc(225) int local225 = ((Static650.aByteArray102[2] & 0xFF) << 8) + (Static650.aByteArray102[3] & 0xFF);
						local175 = ((Static650.aByteArray102[4] & 0xFF) << 16) - (-((Static650.aByteArray102[5] & 0xFF) << 8) - (Static650.aByteArray102[6] & 0xFF));
						@Pc(255) int local255 = Static650.aByteArray102[7] & 0xFF;
						if (arg2 != local211 || local225 != local171 || local255 != this.anInt1360) {
							return false;
						}
						if (local175 < 0 || this.aClass141_1.method4078() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg0 = false;
						local175 = (int) ((this.aClass141_1.method4078() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local27) {
							local175++;
						}
					}
					Static650.aByteArray102[3] = (byte) local171;
					if (arg3 - local169 <= 512) {
						local175 = 0;
					}
					Static650.aByteArray102[0] = (byte) (arg2 >> 8);
					Static650.aByteArray102[1] = (byte) arg2;
					Static650.aByteArray102[2] = (byte) (local171 >> 8);
					Static650.aByteArray102[4] = (byte) (local175 >> 16);
					Static650.aByteArray102[6] = (byte) local175;
					Static650.aByteArray102[7] = (byte) this.anInt1360;
					Static650.aByteArray102[5] = (byte) (local175 >> 8);
					this.aClass141_1.method4074((long) (local27 * 520));
					this.aClass141_1.method4075(8, 0, Static650.aByteArray102);
					local211 = arg3 - local169;
					if (local211 > 512) {
						local211 = 512;
					}
					this.aClass141_1.method4075(local211, local169, arg1);
					local169 += local211;
					local27 = local175;
					local171++;
				}
				return true;
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B[BII)Z")
	public boolean method1303(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class141 local6 = this.aClass141_1;
		synchronized (this.aClass141_1) {
			if (arg2 < 0 || arg2 > this.anInt1363) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method1302(true, arg0, arg1, arg2);
			if (!local31) {
				local31 = this.method1302(false, arg0, arg1, arg2);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!ce", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1360;
	}
}
