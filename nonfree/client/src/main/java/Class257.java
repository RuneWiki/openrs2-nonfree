import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class257 {

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	private int anInt7310 = 65000;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "Lclient!sb;")
	private Class219 aClass219_6 = null;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Lclient!sb;")
	private Class219 aClass219_5 = null;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	private final int anInt7312;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(ILclient!sb;Lclient!sb;I)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class219 arg2, @OriginalArg(3) int arg3) {
		this.aClass219_5 = arg1;
		this.anInt7312 = arg0;
		this.aClass219_6 = arg2;
		this.anInt7310 = arg3;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[BII)Z")
	public boolean method5718(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class219 local11 = this.aClass219_5;
		synchronized (this.aClass219_5) {
			if (arg2 < 0 || this.anInt7310 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method5719(arg2, arg1, arg0, true);
			if (!local34) {
				local34 = this.method5719(arg2, arg1, arg0, false);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB[BIZ)Z")
	private boolean method5719(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class219 local8 = this.aClass219_5;
		synchronized (this.aClass219_5) {
			try {
				@Pc(67) int local67;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass219_6.method4841()) {
						return false;
					}
					this.aClass219_6.method4836((long) (arg2 * 6));
					this.aClass219_6.method4837(Static214.aByteArray48, 6, 0);
					local67 = (Static214.aByteArray48[5] & 0xFF) + ((Static214.aByteArray48[4] & 0xFF) << 8) + ((Static214.aByteArray48[3] & 0xFF) << 16);
					if (local67 <= 0 || this.aClass219_5.method4841() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass219_5.method4841() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static214.aByteArray48[5] = (byte) local67;
				Static214.aByteArray48[1] = (byte) (arg0 >> 8);
				Static214.aByteArray48[0] = (byte) (arg0 >> 16);
				Static214.aByteArray48[3] = (byte) (local67 >> 16);
				Static214.aByteArray48[4] = (byte) (local67 >> 8);
				Static214.aByteArray48[2] = (byte) arg0;
				this.aClass219_6.method4836((long) (arg2 * 6));
				this.aClass219_6.method4847(6, Static214.aByteArray48, 0);
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				while (arg0 > local163) {
					@Pc(169) int local169 = 0;
					@Pc(204) int local204;
					if (arg3) {
						this.aClass219_5.method4836((long) (local67 * 520));
						try {
							this.aClass219_5.method4837(Static214.aByteArray48, 8, 0);
						} catch (@Pc(188) EOFException local188) {
							return true;
						}
						local204 = ((Static214.aByteArray48[0] & 0xFF) << 8) + (Static214.aByteArray48[1] & 0xFF);
						@Pc(218) int local218 = (Static214.aByteArray48[3] & 0xFF) + ((Static214.aByteArray48[2] & 0xFF) << 8);
						local169 = ((Static214.aByteArray48[4] & 0xFF) << 16) + ((Static214.aByteArray48[5] & 0xFF) << 8) + (Static214.aByteArray48[6] & 0xFF);
						@Pc(247) int local247 = Static214.aByteArray48[7] & 0xFF;
						if (arg2 != local204 || local218 != local165 || local247 != this.anInt7312) {
							return false;
						}
						if (local169 < 0 || (long) local169 > this.aClass219_5.method4841() / 520L) {
							return false;
						}
					}
					if (local169 == 0) {
						local169 = (int) ((this.aClass219_5.method4841() + 519L) / 520L);
						arg3 = false;
						if (local169 == 0) {
							local169++;
						}
						if (local67 == local169) {
							local169++;
						}
					}
					Static214.aByteArray48[1] = (byte) arg2;
					Static214.aByteArray48[2] = (byte) (local165 >> 8);
					if (arg0 - local163 <= 512) {
						local169 = 0;
					}
					Static214.aByteArray48[3] = (byte) local165;
					Static214.aByteArray48[0] = (byte) (arg2 >> 8);
					Static214.aByteArray48[7] = (byte) this.anInt7312;
					Static214.aByteArray48[4] = (byte) (local169 >> 16);
					Static214.aByteArray48[6] = (byte) local169;
					Static214.aByteArray48[5] = (byte) (local169 >> 8);
					this.aClass219_5.method4836((long) (local67 * 520));
					this.aClass219_5.method4847(8, Static214.aByteArray48, 0);
					local204 = arg0 - local163;
					if (local204 > 512) {
						local204 = 512;
					}
					this.aClass219_5.method4847(local204, arg1, local163);
					local67 = local169;
					local163 += local204;
					local165++;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[B")
	public byte[] method5721(@OriginalArg(1) int arg0) {
		@Pc(8) Class219 local8 = this.aClass219_5;
		synchronized (this.aClass219_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass219_6.method4841()) {
					return null;
				}
				this.aClass219_6.method4836((long) (arg0 * 6));
				this.aClass219_6.method4837(Static214.aByteArray48, 6, 0);
				@Pc(66) int local66 = ((Static214.aByteArray48[1] & 0xFF) << 8) + ((Static214.aByteArray48[0] & 0xFF) << 16) + (Static214.aByteArray48[2] & 0xFF);
				@Pc(89) int local89 = ((Static214.aByteArray48[3] & 0xFF) << 16) + ((Static214.aByteArray48[4] << 8 & 0xFF00) + (Static214.aByteArray48[5] & 0xFF));
				if (local66 < 0 || local66 > this.anInt7310) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aClass219_5.method4841() / 520L) {
					@Pc(137) byte[] local137 = new byte[local66];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					while (local66 > local139) {
						if (local89 == 0) {
							return null;
						}
						this.aClass219_5.method4836((long) (local89 * 520));
						@Pc(163) int local163 = local66 - local139;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass219_5.method4837(Static214.aByteArray48, local163 + 8, 0);
						@Pc(191) int local191 = ((Static214.aByteArray48[0] & 0xFF) << 8) + (Static214.aByteArray48[1] & 0xFF);
						@Pc(206) int local206 = ((Static214.aByteArray48[2] & 0xFF) << 8) + (Static214.aByteArray48[3] & 0xFF);
						@Pc(228) int local228 = (Static214.aByteArray48[6] & 0xFF) + ((Static214.aByteArray48[5] & 0xFF) << 8) + ((Static214.aByteArray48[4] & 0xFF) << 16);
						@Pc(234) int local234 = Static214.aByteArray48[7] & 0xFF;
						if (arg0 == local191 && local141 == local206 && this.anInt7312 == local234) {
							if (local228 >= 0 && (long) local228 <= this.aClass219_5.method4841() / 520L) {
								local89 = local228;
								for (@Pc(287) int local287 = 0; local287 < local163; local287++) {
									local137[local139++] = Static214.aByteArray48[local287 + 8];
								}
								local141++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local137;
				} else {
					return null;
				}
			} catch (@Pc(321) IOException local321) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7312;
	}
}
