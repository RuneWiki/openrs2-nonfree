import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class38 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!qm;")
	private Class192 aClass192_2 = null;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	private int anInt822 = 65000;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!qm;")
	private Class192 aClass192_3 = null;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	private final int anInt821;

	static {
		new Class169("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILclient!qm;Lclient!qm;I)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int arg3) {
		this.aClass192_3 = arg1;
		this.aClass192_2 = arg2;
		this.anInt822 = arg3;
		this.anInt821 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt821;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)[B")
	public byte[] method651(@OriginalArg(1) int arg0) {
		@Pc(8) Class192 local8 = this.aClass192_3;
		synchronized (this.aClass192_3) {
			try {
				if (this.aClass192_2.method4388() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass192_2.method4397((long) (arg0 * 6));
				this.aClass192_2.method4396(0, 6, Static255.aByteArray73);
				@Pc(66) int local66 = ((Static255.aByteArray73[1] & 0xFF) << 8) + ((Static255.aByteArray73[0] & 0xFF) << 16) + (Static255.aByteArray73[2] & 0xFF);
				@Pc(89) int local89 = ((Static255.aByteArray73[4] & 0xFF) << 8) + (Static255.aByteArray73[3] << 16 & 0xFF0000) + (Static255.aByteArray73[5] & 0xFF);
				if (local66 < 0 || local66 > this.anInt822) {
					return null;
				} else if (local89 > 0 && this.aClass192_3.method4388() / 520L >= (long) local89) {
					@Pc(133) byte[] local133 = new byte[local66];
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					while (local135 < local66) {
						if (local89 == 0) {
							return null;
						}
						this.aClass192_3.method4397((long) (local89 * 520));
						@Pc(166) int local166 = local66 - local135;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass192_3.method4396(0, local166 + 8, Static255.aByteArray73);
						@Pc(194) int local194 = ((Static255.aByteArray73[0] & 0xFF) << 8) + (Static255.aByteArray73[1] & 0xFF);
						@Pc(208) int local208 = ((Static255.aByteArray73[2] & 0xFF) << 8) + (Static255.aByteArray73[3] & 0xFF);
						@Pc(230) int local230 = (Static255.aByteArray73[6] & 0xFF) + ((Static255.aByteArray73[5] & 0xFF) << 8) + ((Static255.aByteArray73[4] & 0xFF) << 16);
						@Pc(236) int local236 = Static255.aByteArray73[7] & 0xFF;
						if (arg0 == local194 && local137 == local208 && this.anInt821 == local236) {
							if (local230 >= 0 && this.aClass192_3.method4388() / 520L >= (long) local230) {
								for (@Pc(284) int local284 = 0; local284 < local166; local284++) {
									local133[local135++] = Static255.aByteArray73[local284 + 8];
								}
								local89 = local230;
								local137++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local133;
				} else {
					return null;
				}
			} catch (@Pc(320) IOException local320) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[BIZB)Z")
	private boolean method653(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class192 local8 = this.aClass192_3;
		synchronized (this.aClass192_3) {
			try {
				@Pc(79) int local79;
				if (arg3) {
					if (this.aClass192_2.method4388() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass192_2.method4397((long) (arg0 * 6));
					this.aClass192_2.method4396(0, 6, Static255.aByteArray73);
					local79 = ((Static255.aByteArray73[4] & 0xFF) << 8) + ((Static255.aByteArray73[3] & 0xFF) << 16) + (Static255.aByteArray73[5] & 0xFF);
					if (local79 <= 0 || (long) local79 > this.aClass192_3.method4388() / 520L) {
						return false;
					}
				} else {
					local79 = (int) ((this.aClass192_3.method4388() + 519L) / 520L);
					if (local79 == 0) {
						local79 = 1;
					}
				}
				Static255.aByteArray73[0] = (byte) (arg2 >> 16);
				Static255.aByteArray73[1] = (byte) (arg2 >> 8);
				Static255.aByteArray73[5] = (byte) local79;
				Static255.aByteArray73[4] = (byte) (local79 >> 8);
				Static255.aByteArray73[2] = (byte) arg2;
				Static255.aByteArray73[3] = (byte) (local79 >> 16);
				this.aClass192_2.method4397((long) (arg0 * 6));
				this.aClass192_2.method4389(6, Static255.aByteArray73, 0);
				@Pc(169) int local169 = 0;
				@Pc(171) int local171 = 0;
				while (arg2 > local169) {
					@Pc(175) int local175 = 0;
					@Pc(210) int local210;
					if (arg3) {
						this.aClass192_3.method4397((long) (local79 * 520));
						try {
							this.aClass192_3.method4396(0, 8, Static255.aByteArray73);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = ((Static255.aByteArray73[0] & 0xFF) << 8) + (Static255.aByteArray73[1] & 0xFF);
						local175 = (Static255.aByteArray73[6] & 0xFF) + ((Static255.aByteArray73[5] & 0xFF) << 8) + ((Static255.aByteArray73[4] & 0xFF) << 16);
						@Pc(246) int local246 = (Static255.aByteArray73[3] & 0xFF) + ((Static255.aByteArray73[2] & 0xFF) << 8);
						@Pc(252) int local252 = Static255.aByteArray73[7] & 0xFF;
						if (arg0 != local210 || local246 != local171 || this.anInt821 != local252) {
							return false;
						}
						if (local175 < 0 || this.aClass192_3.method4388() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg3 = false;
						local175 = (int) ((this.aClass192_3.method4388() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local79 == local175) {
							local175++;
						}
					}
					if (arg2 - local169 <= 512) {
						local175 = 0;
					}
					Static255.aByteArray73[3] = (byte) local171;
					Static255.aByteArray73[2] = (byte) (local171 >> 8);
					Static255.aByteArray73[0] = (byte) (arg0 >> 8);
					Static255.aByteArray73[1] = (byte) arg0;
					Static255.aByteArray73[5] = (byte) (local175 >> 8);
					Static255.aByteArray73[4] = (byte) (local175 >> 16);
					Static255.aByteArray73[6] = (byte) local175;
					Static255.aByteArray73[7] = (byte) this.anInt821;
					this.aClass192_3.method4397((long) (local79 * 520));
					this.aClass192_3.method4389(8, Static255.aByteArray73, 0);
					local210 = arg2 - local169;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass192_3.method4389(local210, arg1, local169);
					local171++;
					local169 += local210;
					local79 = local175;
				}
				return true;
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[BZI)Z")
	public boolean method654(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class192 local11 = this.aClass192_3;
		synchronized (this.aClass192_3) {
			if (arg2 < 0 || this.anInt822 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method653(arg0, arg1, arg2, true);
			if (!local34) {
				local34 = this.method653(arg0, arg1, arg2, false);
			}
			return local34;
		}
	}
}
