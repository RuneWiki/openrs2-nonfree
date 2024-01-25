import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class135 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "Lclient!sba;")
	private Class297 aClass297_18;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "Ljava/lang/String;")
	private String aString107;

	@OriginalMember(owner = "client!iba", name = "k", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!iba", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!iba", name = "p", descriptor = "Ljava/lang/String;")
	private String aString108;

	@OriginalMember(owner = "client!iba", name = "r", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!iba", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!iba", name = "t", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!iba", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!iba", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!iba", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!iba", name = "z", descriptor = "I")
	public int anInt4465 = -1;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!ie;)V")
	public void method3566(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method6814();
			if (local14 == 0) {
				return;
			}
			this.method3567(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!ie;I)V")
	private void method3567(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.aString107 = arg1.method6797();
		} else if (arg0 == 2) {
			this.aString108 = arg1.method6797();
		} else {
			@Pc(40) int local40;
			@Pc(47) int local47;
			if (arg0 == 3) {
				local40 = arg1.method6814();
				this.anIntArrayArray42 = new int[local40][3];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArrayArray42[local47][0] = arg1.method6811();
					this.anIntArrayArray42[local47][1] = arg1.method6816();
					this.anIntArrayArray42[local47][2] = arg1.method6816();
				}
			} else if (arg0 == 4) {
				local40 = arg1.method6814();
				this.anIntArrayArray41 = new int[local40][3];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArrayArray41[local47][0] = arg1.method6811();
					this.anIntArrayArray41[local47][1] = arg1.method6816();
					this.anIntArrayArray41[local47][2] = arg1.method6816();
				}
			} else if (arg0 == 5) {
				arg1.method6811();
			} else if (arg0 == 6) {
				arg1.method6814();
			} else if (arg0 == 7) {
				arg1.method6814();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method6814();
				} else if (arg0 == 10) {
					local40 = arg1.method6814();
					this.anIntArray203 = new int[local40];
					for (local47 = 0; local47 < local40; local47++) {
						this.anIntArray203[local47] = arg1.method6816();
					}
				} else if (arg0 == 12) {
					arg1.method6816();
				} else if (arg0 == 13) {
					local40 = arg1.method6814();
					this.anIntArray209 = new int[local40];
					for (local47 = 0; local47 < local40; local47++) {
						this.anIntArray209[local47] = arg1.method6811();
					}
				} else if (arg0 == 14) {
					local40 = arg1.method6814();
					this.anIntArrayArray43 = new int[local40][2];
					for (local47 = 0; local47 < local40; local47++) {
						this.anIntArrayArray43[local47][0] = arg1.method6814();
						this.anIntArrayArray43[local47][1] = arg1.method6814();
					}
				} else if (arg0 == 15) {
					arg1.method6811();
				} else if (arg0 == 17) {
					this.anInt4465 = arg1.method6811();
				} else if (arg0 == 18) {
					local40 = arg1.method6814();
					this.anIntArray205 = new int[local40];
					this.anIntArray204 = new int[local40];
					this.anIntArray206 = new int[local40];
					this.aStringArray21 = new String[local40];
					for (local47 = 0; local47 < local40; local47++) {
						this.anIntArray204[local47] = arg1.method6816();
						this.anIntArray206[local47] = arg1.method6816();
						this.anIntArray205[local47] = arg1.method6816();
						this.aStringArray21[local47] = arg1.method6786();
					}
					return;
				} else if (arg0 == 19) {
					local40 = arg1.method6814();
					this.anIntArray202 = new int[local40];
					this.anIntArray208 = new int[local40];
					this.aStringArray20 = new String[local40];
					this.anIntArray207 = new int[local40];
					for (local47 = 0; local47 < local40; local47++) {
						this.anIntArray207[local47] = arg1.method6816();
						this.anIntArray202[local47] = arg1.method6816();
						this.anIntArray208[local47] = arg1.method6816();
						this.aStringArray20[local47] = arg1.method6786();
					}
					return;
				} else if (arg0 == 249) {
					local40 = arg1.method6814();
					if (this.aClass297_18 == null) {
						local47 = Static538.method7366(local40);
						this.aClass297_18 = new Class297(local47);
					}
					for (local47 = 0; local47 < local40; local47++) {
						@Pc(478) boolean local478 = arg1.method6814() == 1;
						@Pc(482) int local482 = arg1.method6830();
						@Pc(491) Class3 local491;
						if (local478) {
							local491 = new Class3_Sub46(arg1.method6786());
						} else {
							local491 = new Class3_Sub2(arg1.method6816());
						}
						this.aClass297_18.method6537((long) local482, local491);
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
	public void method3569() {
		if (this.aString108 == null) {
			this.aString108 = this.aString107;
		}
	}
}
