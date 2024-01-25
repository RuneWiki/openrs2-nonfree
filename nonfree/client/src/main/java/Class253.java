import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class253 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!ok;")
	private Class176 aClass176_4 = null;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!ok;")
	private Class176 aClass176_5 = null;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	private int anInt7209 = 65000;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	private final int anInt7201;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILclient!ok;Lclient!ok;I)V")
	public Class253(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3) {
		this.anInt7201 = arg0;
		this.anInt7209 = arg3;
		this.aClass176_4 = arg2;
		this.aClass176_5 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7201;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZII[B)Z")
	private boolean method5841(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class176 local8 = this.aClass176_5;
		synchronized (this.aClass176_5) {
			try {
				@Pc(73) int local73;
				if (arg1) {
					if ((long) (arg2 * 6 + 6) > this.aClass176_4.method4274()) {
						return false;
					}
					this.aClass176_4.method4271((long) (arg2 * 6));
					this.aClass176_4.method4267(0, Static153.aByteArray52, 6);
					local73 = ((Static153.aByteArray52[4] & 0xFF) << 8) + ((Static153.aByteArray52[3] & 0xFF) << 16) + (Static153.aByteArray52[5] & 0xFF);
					if (local73 <= 0 || (long) local73 > this.aClass176_5.method4274() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass176_5.method4274() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static153.aByteArray52[5] = (byte) local73;
				Static153.aByteArray52[4] = (byte) (local73 >> 8);
				Static153.aByteArray52[3] = (byte) (local73 >> 16);
				Static153.aByteArray52[0] = (byte) (arg0 >> 16);
				Static153.aByteArray52[1] = (byte) (arg0 >> 8);
				Static153.aByteArray52[2] = (byte) arg0;
				this.aClass176_4.method4271((long) (arg2 * 6));
				this.aClass176_4.method4265(Static153.aByteArray52, 6, 0);
				@Pc(175) int local175 = 0;
				@Pc(177) int local177 = 0;
				while (arg0 > local175) {
					@Pc(181) int local181 = 0;
					@Pc(218) int local218;
					if (arg1) {
						this.aClass176_5.method4271((long) (local73 * 520));
						try {
							this.aClass176_5.method4267(0, Static153.aByteArray52, 8);
						} catch (@Pc(202) EOFException local202) {
							return true;
						}
						local218 = (Static153.aByteArray52[1] & 0xFF) + ((Static153.aByteArray52[0] & 0xFF) << 8);
						@Pc(233) int local233 = ((Static153.aByteArray52[2] & 0xFF) << 8) + (Static153.aByteArray52[3] & 0xFF);
						local181 = (Static153.aByteArray52[6] & 0xFF) + ((Static153.aByteArray52[5] & 0xFF) << 8) + ((Static153.aByteArray52[4] & 0xFF) << 16);
						@Pc(261) int local261 = Static153.aByteArray52[7] & 0xFF;
						if (local218 != arg2 || local233 != local177 || this.anInt7201 != local261) {
							return false;
						}
						if (local181 < 0 || (long) local181 > this.aClass176_5.method4274() / 520L) {
							return false;
						}
					}
					if (local181 == 0) {
						local181 = (int) ((this.aClass176_5.method4274() + 519L) / 520L);
						arg1 = false;
						if (local181 == 0) {
							local181++;
						}
						if (local181 == local73) {
							local181++;
						}
					}
					Static153.aByteArray52[1] = (byte) arg2;
					Static153.aByteArray52[0] = (byte) (arg2 >> 8);
					Static153.aByteArray52[2] = (byte) (local177 >> 8);
					Static153.aByteArray52[3] = (byte) local177;
					if (arg0 - local175 <= 512) {
						local181 = 0;
					}
					Static153.aByteArray52[5] = (byte) (local181 >> 8);
					Static153.aByteArray52[6] = (byte) local181;
					Static153.aByteArray52[7] = (byte) this.anInt7201;
					Static153.aByteArray52[4] = (byte) (local181 >> 16);
					this.aClass176_5.method4271((long) (local73 * 520));
					this.aClass176_5.method4265(Static153.aByteArray52, 8, 0);
					local218 = arg0 - local175;
					if (local218 > 512) {
						local218 = 512;
					}
					this.aClass176_5.method4265(arg3, local218, local175);
					local175 += local218;
					local73 = local181;
					local177++;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[B")
	public byte[] method5843(@OriginalArg(0) int arg0) {
		@Pc(8) Class176 local8 = this.aClass176_5;
		synchronized (this.aClass176_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass176_4.method4274()) {
					return null;
				}
				this.aClass176_4.method4271((long) (arg0 * 6));
				this.aClass176_4.method4267(0, Static153.aByteArray52, 6);
				@Pc(75) int local75 = ((Static153.aByteArray52[0] & 0xFF) << 16) - (-((Static153.aByteArray52[1] & 0xFF) << 8) - (Static153.aByteArray52[2] & 0xFF));
				@Pc(99) int local99 = ((Static153.aByteArray52[3] & 0xFF) << 16) + ((Static153.aByteArray52[4] & 0xFF) << 8) + (Static153.aByteArray52[5] & 0xFF);
				if (local75 < 0 || this.anInt7209 < local75) {
					return null;
				} else if (local99 > 0 && this.aClass176_5.method4274() / 520L >= (long) local99) {
					@Pc(143) byte[] local143 = new byte[local75];
					@Pc(145) int local145 = 0;
					@Pc(147) int local147 = 0;
					while (local75 > local145) {
						if (local99 == 0) {
							return null;
						}
						this.aClass176_5.method4271((long) (local99 * 520));
						@Pc(170) int local170 = local75 - local145;
						if (local170 > 512) {
							local170 = 512;
						}
						this.aClass176_5.method4267(0, Static153.aByteArray52, local170 + 8);
						@Pc(198) int local198 = (Static153.aByteArray52[1] & 0xFF) + ((Static153.aByteArray52[0] & 0xFF) << 8);
						@Pc(212) int local212 = ((Static153.aByteArray52[2] & 0xFF) << 8) + (Static153.aByteArray52[3] & 0xFF);
						@Pc(234) int local234 = (Static153.aByteArray52[6] & 0xFF) + ((Static153.aByteArray52[5] & 0xFF) << 8) + ((Static153.aByteArray52[4] & 0xFF) << 16);
						@Pc(240) int local240 = Static153.aByteArray52[7] & 0xFF;
						if (local198 == arg0 && local147 == local212 && local240 == this.anInt7201) {
							if (local234 >= 0 && (long) local234 <= this.aClass176_5.method4274() / 520L) {
								for (@Pc(276) int local276 = 0; local276 < local170; local276++) {
									local143[local145++] = Static153.aByteArray52[local276 + 8];
								}
								local147++;
								local99 = local234;
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
			} catch (@Pc(308) IOException local308) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[B)Z")
	public boolean method5848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class176 local6 = this.aClass176_5;
		synchronized (this.aClass176_5) {
			if (arg1 < 0 || arg1 > this.anInt7209) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method5841(arg1, true, arg0, arg2);
			if (!local37) {
				local37 = this.method5841(arg1, false, arg0, arg2);
			}
			return local37;
		}
	}
}
