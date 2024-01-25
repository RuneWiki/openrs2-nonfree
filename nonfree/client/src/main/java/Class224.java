import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class224 {

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "[I")
	public static final int[] anIntArray451 = new int[4096];

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "Lclient!bp;")
	private Class38 aClass38_4 = null;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "Lclient!bp;")
	private Class38 aClass38_3 = null;

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
	private int anInt6487 = 65000;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
	private final int anInt6484;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray451[local4] = Static405.method6343(local4);
		}
	}

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(ILclient!bp;Lclient!bp;I)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) int arg3) {
		this.aClass38_3 = arg1;
		this.anInt6487 = arg3;
		this.anInt6484 = arg0;
		this.aClass38_4 = arg2;
	}

	@OriginalMember(owner = "client!oba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6484;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I[BII)Z")
	public boolean method5418(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class38 local6 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			if (arg2 < 0 || this.anInt6487 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method5422(arg0, true, arg2, arg1);
			if (!local35) {
				local35 = this.method5422(arg0, false, arg2, arg1);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[B")
	public byte[] method5420(@OriginalArg(1) int arg0) {
		@Pc(8) Class38 local8 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass38_4.method852()) {
					return null;
				}
				this.aClass38_4.method858((long) (arg0 * 6));
				this.aClass38_4.method855(Static427.aByteArray98, 6, 0);
				@Pc(67) int local67 = (Static427.aByteArray98[2] & 0xFF) + ((Static427.aByteArray98[1] & 0xFF) << 8) + ((Static427.aByteArray98[0] & 0xFF) << 16);
				@Pc(89) int local89 = ((Static427.aByteArray98[4] & 0xFF) << 8) + ((Static427.aByteArray98[3] & 0xFF) << 16) + (Static427.aByteArray98[5] & 0xFF);
				if (local67 < 0 || local67 > this.anInt6487) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aClass38_3.method852() / 520L) {
					@Pc(133) byte[] local133 = new byte[local67];
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					while (local67 > local135) {
						if (local89 == 0) {
							return null;
						}
						this.aClass38_3.method858((long) (local89 * 520));
						@Pc(160) int local160 = local67 - local135;
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass38_3.method855(Static427.aByteArray98, local160 + 8, 0);
						@Pc(191) int local191 = ((Static427.aByteArray98[0] & 0xFF) << 8) + (Static427.aByteArray98[1] & 0xFF);
						@Pc(205) int local205 = (Static427.aByteArray98[3] & 0xFF) + ((Static427.aByteArray98[2] & 0xFF) << 8);
						@Pc(227) int local227 = ((Static427.aByteArray98[5] & 0xFF) << 8) + ((Static427.aByteArray98[4] & 0xFF) << 16) + (Static427.aByteArray98[6] & 0xFF);
						@Pc(233) int local233 = Static427.aByteArray98[7] & 0xFF;
						if (local191 == arg0 && local205 == local137 && local233 == this.anInt6484) {
							if (local227 >= 0 && (long) local227 <= this.aClass38_3.method852() / 520L) {
								for (@Pc(280) int local280 = 0; local280 < local160; local280++) {
									local133[local135++] = Static427.aByteArray98[local280 + 8];
								}
								local137++;
								local89 = local227;
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
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZII[B)Z")
	private boolean method5422(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class38 local8 = this.aClass38_3;
		synchronized (this.aClass38_3) {
			try {
				@Pc(70) int local70;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass38_4.method852()) {
						return false;
					}
					this.aClass38_4.method858((long) (arg0 * 6));
					this.aClass38_4.method855(Static427.aByteArray98, 6, 0);
					local70 = ((Static427.aByteArray98[3] & 0xFF) << 16) + ((Static427.aByteArray98[4] & 0xFF) << 8) + (Static427.aByteArray98[5] & 0xFF);
					if (local70 <= 0 || (long) local70 > this.aClass38_3.method852() / 520L) {
						return false;
					}
				} else {
					local70 = (int) ((this.aClass38_3.method852() + 519L) / 520L);
					if (local70 == 0) {
						local70 = 1;
					}
				}
				Static427.aByteArray98[1] = (byte) (arg2 >> 8);
				Static427.aByteArray98[2] = (byte) arg2;
				Static427.aByteArray98[0] = (byte) (arg2 >> 16);
				Static427.aByteArray98[4] = (byte) (local70 >> 8);
				Static427.aByteArray98[5] = (byte) local70;
				Static427.aByteArray98[3] = (byte) (local70 >> 16);
				this.aClass38_4.method858((long) (arg0 * 6));
				this.aClass38_4.method860(Static427.aByteArray98, 6, 0);
				@Pc(165) int local165 = 0;
				@Pc(167) int local167 = 0;
				while (arg2 > local165) {
					@Pc(171) int local171 = 0;
					@Pc(207) int local207;
					if (arg1) {
						this.aClass38_3.method858((long) (local70 * 520));
						try {
							this.aClass38_3.method855(Static427.aByteArray98, 8, 0);
						} catch (@Pc(190) EOFException local190) {
							return true;
						}
						local207 = ((Static427.aByteArray98[0] & 0xFF) << 8) + (Static427.aByteArray98[1] & 0xFF);
						@Pc(222) int local222 = ((Static427.aByteArray98[2] & 0xFF) << 8) + (Static427.aByteArray98[3] & 0xFF);
						local171 = (Static427.aByteArray98[6] & 0xFF) + ((Static427.aByteArray98[4] & 0xFF) << 16) + ((Static427.aByteArray98[5] & 0xFF) << 8);
						@Pc(250) int local250 = Static427.aByteArray98[7] & 0xFF;
						if (local207 != arg0 || local167 != local222 || local250 != this.anInt6484) {
							return false;
						}
						if (local171 < 0 || this.aClass38_3.method852() / 520L < (long) local171) {
							return false;
						}
					}
					if (local171 == 0) {
						local171 = (int) ((this.aClass38_3.method852() + 519L) / 520L);
						arg1 = false;
						if (local171 == 0) {
							local171++;
						}
						if (local171 == local70) {
							local171++;
						}
					}
					if (arg2 - local165 <= 512) {
						local171 = 0;
					}
					Static427.aByteArray98[2] = (byte) (local167 >> 8);
					Static427.aByteArray98[0] = (byte) (arg0 >> 8);
					Static427.aByteArray98[3] = (byte) local167;
					Static427.aByteArray98[1] = (byte) arg0;
					Static427.aByteArray98[4] = (byte) (local171 >> 16);
					Static427.aByteArray98[7] = (byte) this.anInt6484;
					Static427.aByteArray98[5] = (byte) (local171 >> 8);
					Static427.aByteArray98[6] = (byte) local171;
					this.aClass38_3.method858((long) (local70 * 520));
					this.aClass38_3.method860(Static427.aByteArray98, 8, 0);
					local207 = arg2 - local165;
					if (local207 > 512) {
						local207 = 512;
					}
					this.aClass38_3.method860(arg3, local207, local165);
					local167++;
					local70 = local171;
					local165 += local207;
				}
				return true;
			} catch (@Pc(428) IOException local428) {
				return false;
			}
		}
	}
}
