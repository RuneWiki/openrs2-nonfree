import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class52 {

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!ep;")
	private Class73 aClass73_1 = null;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!ep;")
	private Class73 aClass73_2 = null;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	private int anInt1414 = 65000;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	private final int anInt1413;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(ILclient!ep;Lclient!ep;I)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3) {
		this.anInt1413 = arg0;
		this.anInt1414 = arg3;
		this.aClass73_2 = arg1;
		this.aClass73_1 = arg2;
	}

	@OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1413;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[B")
	public byte[] method1197(@OriginalArg(0) int arg0) {
		@Pc(8) Class73 local8 = this.aClass73_2;
		synchronized (this.aClass73_2) {
			try {
				if (this.aClass73_1.method1516() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass73_1.method1524((long) (arg0 * 6));
				this.aClass73_1.method1514(0, Static65.aByteArray17, 6);
				@Pc(69) int local69 = (Static65.aByteArray17[2] & 0xFF) + ((Static65.aByteArray17[0] & 0xFF) << 16) + ((Static65.aByteArray17[1] & 0xFF) << 8);
				@Pc(97) int local97 = (Static65.aByteArray17[5] & 0xFF) + ((Static65.aByteArray17[3] & 0xFF) << 16) + ((Static65.aByteArray17[4] & 0xFF) << 8);
				if (local69 < 0 || local69 > this.anInt1414) {
					return null;
				} else if (local97 > 0 && (long) local97 <= this.aClass73_2.method1516() / 520L) {
					@Pc(137) byte[] local137 = new byte[local69];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					while (local69 > local139) {
						if (local97 == 0) {
							return null;
						}
						this.aClass73_2.method1524((long) (local97 * 520));
						@Pc(166) int local166 = local69 - local139;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass73_2.method1514(0, Static65.aByteArray17, local166 + 8);
						@Pc(197) int local197 = ((Static65.aByteArray17[0] & 0xFF) << 8) + (Static65.aByteArray17[1] & 0xFF);
						@Pc(211) int local211 = ((Static65.aByteArray17[2] & 0xFF) << 8) + (Static65.aByteArray17[3] & 0xFF);
						@Pc(233) int local233 = ((Static65.aByteArray17[5] & 0xFF) << 8) + ((Static65.aByteArray17[4] & 0xFF) << 16) + (Static65.aByteArray17[6] & 0xFF);
						@Pc(239) int local239 = Static65.aByteArray17[7] & 0xFF;
						if (arg0 == local197 && local211 == local141 && this.anInt1413 == local239) {
							if (local233 >= 0 && this.aClass73_2.method1516() / 520L >= (long) local233) {
								local97 = local233;
								for (@Pc(280) int local280 = 0; local280 < local166; local280++) {
									local137[local139++] = Static65.aByteArray17[local280 + 8];
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
			} catch (@Pc(310) IOException local310) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([BIIBZ)Z")
	private boolean method1199(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class73 local8 = this.aClass73_2;
		synchronized (this.aClass73_2) {
			try {
				@Pc(73) int local73;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass73_1.method1516()) {
						return false;
					}
					this.aClass73_1.method1524((long) (arg2 * 6));
					this.aClass73_1.method1514(0, Static65.aByteArray17, 6);
					local73 = ((Static65.aByteArray17[3] & 0xFF) << 16) + (Static65.aByteArray17[4] << 8 & 0xFF00) + (Static65.aByteArray17[5] & 0xFF);
					if (local73 <= 0 || this.aClass73_2.method1516() / 520L < (long) local73) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass73_2.method1516() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static65.aByteArray17[1] = (byte) (arg1 >> 8);
				Static65.aByteArray17[2] = (byte) arg1;
				Static65.aByteArray17[3] = (byte) (local73 >> 16);
				Static65.aByteArray17[4] = (byte) (local73 >> 8);
				Static65.aByteArray17[0] = (byte) (arg1 >> 16);
				Static65.aByteArray17[5] = (byte) local73;
				this.aClass73_1.method1524((long) (arg2 * 6));
				this.aClass73_1.method1519(6, Static65.aByteArray17, 0);
				@Pc(179) int local179 = 0;
				@Pc(181) int local181 = 0;
				while (arg1 > local179) {
					@Pc(185) int local185 = 0;
					@Pc(220) int local220;
					if (arg3) {
						this.aClass73_2.method1524((long) (local73 * 520));
						try {
							this.aClass73_2.method1514(0, Static65.aByteArray17, 8);
						} catch (@Pc(204) EOFException local204) {
							return true;
						}
						local220 = (Static65.aByteArray17[1] & 0xFF) + ((Static65.aByteArray17[0] & 0xFF) << 8);
						@Pc(234) int local234 = (Static65.aByteArray17[3] & 0xFF) + ((Static65.aByteArray17[2] & 0xFF) << 8);
						local185 = ((Static65.aByteArray17[4] & 0xFF) << 16) + ((Static65.aByteArray17[5] & 0xFF) << 8) + (Static65.aByteArray17[6] & 0xFF);
						@Pc(263) int local263 = Static65.aByteArray17[7] & 0xFF;
						if (arg2 != local220 || local234 != local181 || local263 != this.anInt1413) {
							return false;
						}
						if (local185 < 0 || (long) local185 > this.aClass73_2.method1516() / 520L) {
							return false;
						}
					}
					if (local185 == 0) {
						local185 = (int) ((this.aClass73_2.method1516() + 519L) / 520L);
						arg3 = false;
						if (local185 == 0) {
							local185++;
						}
						if (local73 == local185) {
							local185++;
						}
					}
					if (arg1 - local179 <= 512) {
						local185 = 0;
					}
					Static65.aByteArray17[1] = (byte) arg2;
					Static65.aByteArray17[3] = (byte) local181;
					Static65.aByteArray17[2] = (byte) (local181 >> 8);
					Static65.aByteArray17[0] = (byte) (arg2 >> 8);
					Static65.aByteArray17[5] = (byte) (local185 >> 8);
					Static65.aByteArray17[4] = (byte) (local185 >> 16);
					Static65.aByteArray17[7] = (byte) this.anInt1413;
					Static65.aByteArray17[6] = (byte) local185;
					this.aClass73_2.method1524((long) (local73 * 520));
					this.aClass73_2.method1519(8, Static65.aByteArray17, 0);
					local220 = arg1 - local179;
					if (local220 > 512) {
						local220 = 512;
					}
					this.aClass73_2.method1519(local220, arg0, local179);
					local179 += local220;
					local181++;
					local73 = local185;
				}
				return true;
			} catch (@Pc(443) IOException local443) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[BB)Z")
	public boolean method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(12) Class73 local12 = this.aClass73_2;
		synchronized (this.aClass73_2) {
			if (arg0 < 0 || arg0 > this.anInt1414) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method1199(arg2, arg0, arg1, true);
			if (!local39) {
				local39 = this.method1199(arg2, arg0, arg1, false);
			}
			return local39;
		}
	}
}
