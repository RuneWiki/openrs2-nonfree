import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class204 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!wh;")
	private Class246 aClass246_5 = null;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	private int anInt5149 = 65000;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!wh;")
	private Class246 aClass246_4 = null;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	private final int anInt5151;

	static {
		new Class57("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILclient!wh;Lclient!wh;I)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) int arg3) {
		this.anInt5149 = arg3;
		this.anInt5151 = arg0;
		this.aClass246_5 = arg2;
		this.aClass246_4 = arg1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BII)Z")
	public boolean method4594(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class246 local6 = this.aClass246_4;
		synchronized (this.aClass246_4) {
			if (arg0 < 0 || this.anInt5149 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method4597(arg0, arg1, true, arg2);
			if (!local30) {
				local30 = this.method4597(arg0, arg1, false, arg2);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[B")
	public byte[] method4595(@OriginalArg(1) int arg0) {
		@Pc(8) Class246 local8 = this.aClass246_4;
		synchronized (this.aClass246_4) {
			try {
				if (this.aClass246_5.method5682() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass246_5.method5681((long) (arg0 * 6));
				this.aClass246_5.method5688(6, 0, Static344.aByteArray83);
				@Pc(80) int local80 = ((Static344.aByteArray83[1] & 0xFF) << 8) + (((Static344.aByteArray83[0] & 0xFF) << 16) + (Static344.aByteArray83[2] & 0xFF));
				@Pc(102) int local102 = (Static344.aByteArray83[5] & 0xFF) + ((Static344.aByteArray83[3] & 0xFF) << 16) + ((Static344.aByteArray83[4] & 0xFF) << 8);
				if (local80 < 0 || local80 > this.anInt5149) {
					return null;
				} else if (local102 > 0 && this.aClass246_4.method5682() / 520L >= (long) local102) {
					@Pc(139) byte[] local139 = new byte[local80];
					@Pc(141) int local141 = 0;
					@Pc(143) int local143 = 0;
					while (local80 > local141) {
						if (local102 == 0) {
							return null;
						}
						this.aClass246_4.method5681((long) (local102 * 520));
						@Pc(166) int local166 = local80 - local141;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass246_4.method5688(local166 + 8, 0, Static344.aByteArray83);
						@Pc(194) int local194 = (Static344.aByteArray83[1] & 0xFF) + ((Static344.aByteArray83[0] & 0xFF) << 8);
						@Pc(209) int local209 = ((Static344.aByteArray83[2] & 0xFF) << 8) + (Static344.aByteArray83[3] & 0xFF);
						@Pc(232) int local232 = (Static344.aByteArray83[6] & 0xFF) + (((Static344.aByteArray83[4] & 0xFF) << 16) + ((Static344.aByteArray83[5] & 0xFF) << 8));
						@Pc(238) int local238 = Static344.aByteArray83[7] & 0xFF;
						if (arg0 == local194 && local143 == local209 && local238 == this.anInt5151) {
							if (local232 >= 0 && (long) local232 <= this.aClass246_4.method5682() / 520L) {
								local102 = local232;
								for (@Pc(287) int local287 = 0; local287 < local166; local287++) {
									local139[local141++] = Static344.aByteArray83[local287 + 8];
								}
								local143++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local139;
				} else {
					return null;
				}
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5151;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BBZI)Z")
	private boolean method4597(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class246 local8 = this.aClass246_4;
		synchronized (this.aClass246_4) {
			try {
				@Pc(69) int local69;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass246_5.method5682()) {
						return false;
					}
					this.aClass246_5.method5681((long) (arg3 * 6));
					this.aClass246_5.method5688(6, 0, Static344.aByteArray83);
					local69 = (Static344.aByteArray83[5] & 0xFF) + ((Static344.aByteArray83[4] & 0xFF) << 8) + ((Static344.aByteArray83[3] & 0xFF) << 16);
					if (local69 <= 0 || this.aClass246_4.method5682() / 520L < (long) local69) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass246_4.method5682() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static344.aByteArray83[4] = (byte) (local69 >> 8);
				Static344.aByteArray83[1] = (byte) (arg0 >> 8);
				Static344.aByteArray83[3] = (byte) (local69 >> 16);
				Static344.aByteArray83[2] = (byte) arg0;
				Static344.aByteArray83[0] = (byte) (arg0 >> 16);
				Static344.aByteArray83[5] = (byte) local69;
				this.aClass246_5.method5681((long) (arg3 * 6));
				this.aClass246_5.method5684(6, Static344.aByteArray83, 0);
				@Pc(167) int local167 = 0;
				@Pc(169) int local169 = 0;
				while (local167 < arg0) {
					@Pc(173) int local173 = 0;
					@Pc(210) int local210;
					if (arg2) {
						this.aClass246_4.method5681((long) (local69 * 520));
						try {
							this.aClass246_4.method5688(8, 0, Static344.aByteArray83);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = ((Static344.aByteArray83[0] & 0xFF) << 8) + (Static344.aByteArray83[1] & 0xFF);
						@Pc(225) int local225 = ((Static344.aByteArray83[2] & 0xFF) << 8) + (Static344.aByteArray83[3] & 0xFF);
						local173 = ((Static344.aByteArray83[4] & 0xFF) << 16) + ((Static344.aByteArray83[5] & 0xFF) << 8) + (Static344.aByteArray83[6] & 0xFF);
						@Pc(255) int local255 = Static344.aByteArray83[7] & 0xFF;
						if (local210 != arg3 || local225 != local169 || this.anInt5151 != local255) {
							return false;
						}
						if (local173 < 0 || (long) local173 > this.aClass246_4.method5682() / 520L) {
							return false;
						}
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass246_4.method5682() + 519L) / 520L);
						arg2 = false;
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local69) {
							local173++;
						}
					}
					if (arg0 - local167 <= 512) {
						local173 = 0;
					}
					Static344.aByteArray83[2] = (byte) (local169 >> 8);
					Static344.aByteArray83[1] = (byte) arg3;
					Static344.aByteArray83[0] = (byte) (arg3 >> 8);
					Static344.aByteArray83[3] = (byte) local169;
					Static344.aByteArray83[6] = (byte) local173;
					Static344.aByteArray83[4] = (byte) (local173 >> 16);
					Static344.aByteArray83[5] = (byte) (local173 >> 8);
					Static344.aByteArray83[7] = (byte) this.anInt5151;
					this.aClass246_4.method5681((long) (local69 * 520));
					this.aClass246_4.method5684(8, Static344.aByteArray83, 0);
					local210 = arg0 - local167;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass246_4.method5684(local210, arg1, local167);
					local169++;
					local69 = local173;
					local167 += local210;
				}
				return true;
			} catch (@Pc(429) IOException local429) {
				return false;
			}
		}
	}
}
