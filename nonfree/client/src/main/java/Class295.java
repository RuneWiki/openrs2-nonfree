import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class295 {

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "[I")
	public int[] anIntArray640;

	@OriginalMember(owner = "client!qu", name = "D", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!qu", name = "S", descriptor = "[I")
	public int[] anIntArray643;

	@OriginalMember(owner = "client!qu", name = "U", descriptor = "[[I")
	public int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!qu", name = "bb", descriptor = "[Lclient!ofa;")
	private Class117[] aClass117Array1;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
	public int anInt7956 = -1;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
	public int anInt7961 = -1;

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	public int anInt7959 = -1;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
	public int anInt7968 = -1;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	public int anInt7958 = -1;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
	public int anInt7960 = -1;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
	public int anInt7979 = 0;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public int anInt7957 = -1;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
	public int anInt7970 = -1;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
	public int anInt7971 = 0;

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
	public int anInt7967 = -1;

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
	public int anInt7969 = -1;

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
	public int anInt7974 = -1;

	@OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
	public int anInt7981 = 0;

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
	public int anInt7964 = -1;

	@OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
	public int anInt7986 = -1;

	@OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
	private final int anInt7985 = -1;

	@OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
	public int anInt7983 = 0;

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
	public int anInt7973 = -1;

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
	public int anInt7989 = -1;

	@OriginalMember(owner = "client!qu", name = "T", descriptor = "I")
	public int anInt7995 = 0;

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
	private int anInt7977 = 0;

	@OriginalMember(owner = "client!qu", name = "R", descriptor = "I")
	public int anInt7994 = 0;

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
	public int anInt7976 = 0;

	@OriginalMember(owner = "client!qu", name = "B", descriptor = "[I")
	public int[] anIntArray641 = null;

	@OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
	public int anInt7987 = 0;

	@OriginalMember(owner = "client!qu", name = "K", descriptor = "[I")
	public int[] anIntArray642 = null;

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
	public int anInt7963 = -1;

	@OriginalMember(owner = "client!qu", name = "X", descriptor = "Z")
	public boolean aBoolean661 = true;

	@OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
	public int anInt7984 = -1;

	@OriginalMember(owner = "client!qu", name = "Y", descriptor = "I")
	public int anInt7998 = -1;

	@OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
	public int anInt7980 = 0;

	@OriginalMember(owner = "client!qu", name = "ab", descriptor = "I")
	public int anInt8000 = 0;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
	public int anInt7966 = -1;

	@OriginalMember(owner = "client!qu", name = "P", descriptor = "I")
	public int anInt7992 = 0;

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
	public int anInt7972 = 0;

	@OriginalMember(owner = "client!qu", name = "cb", descriptor = "I")
	public int anInt8001 = -1;

	@OriginalMember(owner = "client!qu", name = "W", descriptor = "I")
	public int anInt7997 = -1;

	@OriginalMember(owner = "client!qu", name = "V", descriptor = "I")
	public int anInt7996 = -1;

	@OriginalMember(owner = "client!qu", name = "N", descriptor = "I")
	public int anInt7990 = -1;

	@OriginalMember(owner = "client!qu", name = "Z", descriptor = "I")
	public int anInt7999 = -1;

	@OriginalMember(owner = "client!qu", name = "db", descriptor = "I")
	public int anInt8002 = -1;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)Z")
	public boolean method6936(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt7990 == arg0) {
			return true;
		} else {
			if (this.anIntArray641 != null) {
				for (@Pc(25) int local25 = 0; local25 < this.anIntArray641.length; local25++) {
					if (arg0 == this.anIntArray641[local25]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)I")
	public int method6937() {
		if (this.anInt7990 != -1) {
			return this.anInt7990;
		} else if (this.anIntArray641 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) this.anInt7977);
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray642[local24]; local24++) {
				local22 -= this.anIntArray642[local24];
			}
			return this.anIntArray641[local24];
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ha;B)[Lclient!ofa;")
	public Class117[] method6939(@OriginalArg(0) Class126 arg0) {
		if (this.aClass117Array1 != null && arg0.anInt8069 == this.anInt7985) {
			return this.aClass117Array1;
		} else if (this.anIntArrayArray48 == null) {
			return null;
		} else {
			this.aClass117Array1 = new Class117[this.anIntArrayArray48.length];
			for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray48.length; local29++) {
				@Pc(33) int local33 = 0;
				@Pc(35) int local35 = 0;
				@Pc(37) int local37 = 0;
				@Pc(39) int local39 = 0;
				@Pc(41) int local41 = 0;
				@Pc(43) int local43 = 0;
				if (this.anIntArrayArray48[local29] != null) {
					local39 = this.anIntArrayArray48[local29][3] << 3;
					local35 = this.anIntArrayArray48[local29][1];
					local37 = this.anIntArrayArray48[local29][2];
					local33 = this.anIntArrayArray48[local29][0];
					local43 = this.anIntArrayArray48[local29][5] << 3;
					local41 = this.anIntArrayArray48[local29][4] << 3;
				}
				if (local33 != 0 || local35 != 0 || local37 != 0 || local39 != 0 || local41 != 0 || local43 != 0) {
					@Pc(125) Class117 local125 = this.aClass117Array1[local29] = arg0.method6998();
					if (local43 != 0) {
						local125.method7257(local43);
					}
					if (local39 != 0) {
						local125.method7258(local39);
					}
					if (local41 != 0) {
						local125.method7243(local41);
					}
					local125.method7247(local33, local35, local37);
				}
			}
			return this.aClass117Array1;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method6940(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8645();
			if (local15 == 0) {
				return;
			}
			this.method6943(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!ee;I)V")
	private void method6943(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7990 = arg0.method8631();
			this.anInt7968 = arg0.method8631();
			if (this.anInt7968 == 65535) {
				this.anInt7968 = -1;
			}
			if (this.anInt7990 == 65535) {
				this.anInt7990 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt7969 = arg0.method8631();
		} else if (arg1 == 3) {
			this.anInt8001 = arg0.method8631();
		} else if (arg1 == 4) {
			this.anInt7958 = arg0.method8631();
		} else if (arg1 == 5) {
			this.anInt7997 = arg0.method8631();
		} else if (arg1 == 6) {
			this.anInt7956 = arg0.method8631();
		} else if (arg1 == 7) {
			this.anInt7959 = arg0.method8631();
		} else if (arg1 == 8) {
			this.anInt7970 = arg0.method8631();
		} else if (arg1 == 9) {
			this.anInt7984 = arg0.method8631();
		} else if (arg1 == 26) {
			this.anInt7981 = (short) (arg0.method8645() * 4);
			this.anInt7971 = (short) (arg0.method8645() * 4);
		} else {
			@Pc(144) int local144;
			@Pc(152) int local152;
			if (arg1 == 27) {
				if (this.anIntArrayArray48 == null) {
					this.anIntArrayArray48 = new int[12][];
				}
				local144 = arg0.method8645();
				this.anIntArrayArray48[local144] = new int[6];
				for (local152 = 0; local152 < 6; local152++) {
					this.anIntArrayArray48[local144][local152] = arg0.method8595();
				}
			} else if (arg1 == 28) {
				this.anIntArray640 = new int[12];
				for (local144 = 0; local144 < 12; local144++) {
					this.anIntArray640[local144] = arg0.method8645();
					if (this.anIntArray640[local144] == 255) {
						this.anIntArray640[local144] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt7995 = arg0.method8645();
			} else if (arg1 == 30) {
				this.anInt7972 = arg0.method8631();
			} else if (arg1 == 31) {
				this.anInt7976 = arg0.method8645();
			} else if (arg1 == 32) {
				this.anInt7980 = arg0.method8631();
			} else if (arg1 == 33) {
				this.anInt7983 = arg0.method8595();
			} else if (arg1 == 34) {
				this.anInt7987 = arg0.method8645();
			} else if (arg1 == 35) {
				this.anInt7979 = arg0.method8631();
			} else if (arg1 == 36) {
				this.anInt7992 = arg0.method8595();
			} else if (arg1 == 37) {
				this.anInt7974 = arg0.method8645();
			} else if (arg1 == 38) {
				this.anInt7966 = arg0.method8631();
			} else if (arg1 == 39) {
				this.anInt7960 = arg0.method8631();
			} else if (arg1 == 40) {
				this.anInt7989 = arg0.method8631();
			} else if (arg1 == 41) {
				this.anInt7964 = arg0.method8631();
			} else if (arg1 == 42) {
				this.anInt7999 = arg0.method8631();
			} else if (arg1 == 43) {
				this.anInt7963 = arg0.method8631();
			} else if (arg1 == 44) {
				this.anInt7998 = arg0.method8631();
			} else if (arg1 == 45) {
				this.anInt7996 = arg0.method8631();
			} else if (arg1 == 46) {
				this.anInt7961 = arg0.method8631();
			} else if (arg1 == 47) {
				this.anInt7973 = arg0.method8631();
			} else if (arg1 == 48) {
				this.anInt7986 = arg0.method8631();
			} else if (arg1 == 49) {
				this.anInt7967 = arg0.method8631();
			} else if (arg1 == 50) {
				this.anInt7957 = arg0.method8631();
			} else if (arg1 == 51) {
				this.anInt8002 = arg0.method8631();
			} else if (arg1 == 52) {
				local144 = arg0.method8645();
				this.anIntArray642 = new int[local144];
				this.anIntArray641 = new int[local144];
				for (local152 = 0; local152 < local144; local152++) {
					this.anIntArray641[local152] = arg0.method8631();
					@Pc(476) int local476 = arg0.method8645();
					this.anIntArray642[local152] = local476;
					this.anInt7977 += local476;
				}
			} else if (arg1 == 53) {
				this.aBoolean661 = false;
			} else if (arg1 == 54) {
				this.anInt8000 = arg0.method8645() << 6;
				this.anInt7994 = arg0.method8645() << 6;
			} else if (arg1 == 55) {
				if (this.anIntArray643 == null) {
					this.anIntArray643 = new int[12];
				}
				local144 = arg0.method8645();
				this.anIntArray643[local144] = arg0.method8631();
			} else if (arg1 == 56) {
				if (this.anIntArrayArray49 == null) {
					this.anIntArrayArray49 = new int[12][];
				}
				local144 = arg0.method8645();
				this.anIntArrayArray49[local144] = new int[3];
				for (local152 = 0; local152 < 3; local152++) {
					this.anIntArrayArray49[local144][local152] = arg0.method8595();
				}
			}
		}
	}
}
