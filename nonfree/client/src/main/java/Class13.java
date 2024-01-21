import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class13 {

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Lclient!lc;")
	private Class41 aClass41_10 = null;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
	private int anInt349 = 65000;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Lclient!lc;")
	private Class41 aClass41_11 = null;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	private final int anInt338;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(ILclient!lc;Lclient!lc;I)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) int arg3) {
		this.anInt338 = arg0;
		this.aClass41_11 = arg2;
		this.aClass41_10 = arg1;
		this.anInt349 = arg3;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)[B")
	public byte[] method313(@OriginalArg(1) int arg0) {
		@Pc(8) Class41 local8 = this.aClass41_10;
		synchronized (this.aClass41_10) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass41_11.method1349()) {
					return null;
				}
				this.aClass41_11.method1337((long) (arg0 * 6));
				this.aClass41_11.method1345(Static8.aByteArray10, 0, 6);
				@Pc(76) int local76 = ((Static8.aByteArray10[3] & 0xFF) << 16) + ((Static8.aByteArray10[4] & 0xFF) << 8) + (Static8.aByteArray10[5] & 0xFF);
				@Pc(99) int local99 = (Static8.aByteArray10[2] & 0xFF) + (((Static8.aByteArray10[0] & 0xFF) << 16) + ((Static8.aByteArray10[1] & 0xFF) << 8));
				if (local99 < 0 || local99 > this.anInt349) {
					return null;
				} else if (local76 > 0 && this.aClass41_10.method1349() / 520L >= (long) local76) {
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					@Pc(143) byte[] local143 = new byte[local99];
					while (local138 < local99) {
						if (local76 == 0) {
							return null;
						}
						this.aClass41_10.method1337((long) (local76 * 520));
						@Pc(165) int local165 = local99 - local138;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass41_10.method1345(Static8.aByteArray10, 0, local165 + 8);
						@Pc(195) int local195 = (Static8.aByteArray10[3] & 0xFF) + ((Static8.aByteArray10[2] & 0xFF) << 8);
						@Pc(201) int local201 = Static8.aByteArray10[7] & 0xFF;
						@Pc(215) int local215 = (Static8.aByteArray10[1] & 0xFF) + ((Static8.aByteArray10[0] & 0xFF) << 8);
						@Pc(237) int local237 = (Static8.aByteArray10[6] & 0xFF) + ((Static8.aByteArray10[4] & 0xFF) << 16) + ((Static8.aByteArray10[5] & 0xFF) << 8);
						if (local215 == arg0 && local140 == local195 && local201 == this.anInt338) {
							if (local237 >= 0 && this.aClass41_10.method1349() / 520L >= (long) local237) {
								local140++;
								for (@Pc(289) int local289 = 0; local289 < local165; local289++) {
									local143[local138++] = Static8.aByteArray10[local289 + 8];
								}
								local76 = local237;
								continue;
							}
							return null;
						}
						return null;
					}
					return local143;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt338;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method315(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class41 local8 = this.aClass41_10;
		synchronized (this.aClass41_10) {
			try {
				@Pc(69) int local69;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass41_11.method1349()) {
						return false;
					}
					this.aClass41_11.method1337((long) (arg3 * 6));
					this.aClass41_11.method1345(Static8.aByteArray10, 0, 6);
					local69 = ((Static8.aByteArray10[4] & 0xFF) << 8) + ((Static8.aByteArray10[3] & 0xFF) << 16) + (Static8.aByteArray10[5] & 0xFF);
					if (local69 <= 0 || this.aClass41_10.method1349() / 520L < (long) local69) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass41_10.method1349() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static8.aByteArray10[5] = (byte) local69;
				Static8.aByteArray10[0] = (byte) (arg2 >> 16);
				Static8.aByteArray10[1] = (byte) (arg2 >> 8);
				@Pc(127) int local127 = 0;
				Static8.aByteArray10[2] = (byte) arg2;
				Static8.aByteArray10[3] = (byte) (local69 >> 16);
				@Pc(141) int local141 = 0;
				Static8.aByteArray10[4] = (byte) (local69 >> 8);
				this.aClass41_11.method1337((long) (arg3 * 6));
				this.aClass41_11.method1339(Static8.aByteArray10, 0, 6);
				while (arg2 > local127) {
					@Pc(169) int local169 = 0;
					@Pc(226) int local226;
					if (arg0) {
						this.aClass41_10.method1337((long) (local69 * 520));
						try {
							this.aClass41_10.method1345(Static8.aByteArray10, 0, 8);
						} catch (@Pc(188) EOFException local188) {
							return true;
						}
						local169 = (Static8.aByteArray10[6] & 0xFF) + ((Static8.aByteArray10[4] & 0xFF) << 16) + ((Static8.aByteArray10[5] & 0xFF) << 8);
						local226 = (Static8.aByteArray10[1] & 0xFF) + ((Static8.aByteArray10[0] & 0xFF) << 8);
						@Pc(232) int local232 = Static8.aByteArray10[7] & 0xFF;
						@Pc(246) int local246 = ((Static8.aByteArray10[2] & 0xFF) << 8) + (Static8.aByteArray10[3] & 0xFF);
						if (local226 != arg3 || local141 != local246 || local232 != this.anInt338) {
							return false;
						}
						if (local169 < 0 || (long) local169 > this.aClass41_10.method1349() / 520L) {
							return false;
						}
					}
					if (local169 == 0) {
						arg0 = false;
						local169 = (int) ((this.aClass41_10.method1349() + 519L) / 520L);
						if (local169 == 0) {
							local169++;
						}
						if (local69 == local169) {
							local169++;
						}
					}
					Static8.aByteArray10[0] = (byte) (arg3 >> 8);
					Static8.aByteArray10[3] = (byte) local141;
					if (arg2 - local127 <= 512) {
						local169 = 0;
					}
					Static8.aByteArray10[2] = (byte) (local141 >> 8);
					Static8.aByteArray10[6] = (byte) local169;
					Static8.aByteArray10[5] = (byte) (local169 >> 8);
					Static8.aByteArray10[4] = (byte) (local169 >> 16);
					Static8.aByteArray10[7] = (byte) this.anInt338;
					local226 = arg2 - local127;
					if (local226 > 512) {
						local226 = 512;
					}
					local141++;
					Static8.aByteArray10[1] = (byte) arg3;
					this.aClass41_10.method1337((long) (local69 * 520));
					local69 = local169;
					this.aClass41_10.method1339(Static8.aByteArray10, 0, 8);
					this.aClass41_10.method1339(arg1, local127, local226);
					local127 += local226;
				}
				return true;
			} catch (@Pc(422) IOException local422) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([BBII)Z")
	public boolean method319(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class41 local6 = this.aClass41_10;
		synchronized (this.aClass41_10) {
			if (arg1 < 0 || this.anInt349 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method315(true, arg0, arg1, arg2);
			if (!local36) {
				local36 = this.method315(false, arg0, arg1, arg2);
			}
			return local36;
		}
	}
}
