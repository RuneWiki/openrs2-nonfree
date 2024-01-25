import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class82 {

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Lclient!qha;")
	private Class291 aClass291_6;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!dba", name = "o", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
	public int anInt1565 = -1;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
	public void method1407() {
		if (this.aString30 == null) {
			this.aString30 = this.aString31;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BILclient!ib;)V")
	private void method1408(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.aString31 = arg1.method8473();
		} else if (arg0 == 2) {
			this.aString30 = arg1.method8473();
		} else {
			@Pc(42) int local42;
			@Pc(49) int local49;
			if (arg0 == 3) {
				local42 = arg1.method8529();
				this.anIntArrayArray8 = new int[local42][3];
				for (local49 = 0; local49 < local42; local49++) {
					this.anIntArrayArray8[local49][0] = arg1.method8519();
					this.anIntArrayArray8[local49][1] = arg1.method8527();
					this.anIntArrayArray8[local49][2] = arg1.method8527();
				}
			} else if (arg0 == 4) {
				local42 = arg1.method8529();
				this.anIntArrayArray7 = new int[local42][3];
				for (local49 = 0; local49 < local42; local49++) {
					this.anIntArrayArray7[local49][0] = arg1.method8519();
					this.anIntArrayArray7[local49][1] = arg1.method8527();
					this.anIntArrayArray7[local49][2] = arg1.method8527();
				}
			} else if (arg0 == 5) {
				arg1.method8519();
			} else if (arg0 == 6) {
				arg1.method8529();
			} else if (arg0 == 7) {
				arg1.method8529();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method8529();
				} else if (arg0 == 10) {
					local42 = arg1.method8529();
					this.anIntArray79 = new int[local42];
					for (local49 = 0; local49 < local42; local49++) {
						this.anIntArray79[local49] = arg1.method8527();
					}
				} else if (arg0 == 12) {
					arg1.method8527();
				} else if (arg0 == 13) {
					local42 = arg1.method8529();
					this.anIntArray82 = new int[local42];
					for (local49 = 0; local49 < local42; local49++) {
						this.anIntArray82[local49] = arg1.method8519();
					}
				} else if (arg0 == 14) {
					local42 = arg1.method8529();
					this.anIntArrayArray9 = new int[local42][2];
					for (local49 = 0; local49 < local42; local49++) {
						this.anIntArrayArray9[local49][0] = arg1.method8529();
						this.anIntArrayArray9[local49][1] = arg1.method8529();
					}
				} else if (arg0 == 15) {
					arg1.method8519();
				} else if (arg0 == 17) {
					this.anInt1565 = arg1.method8519();
				} else if (arg0 == 18) {
					local42 = arg1.method8529();
					this.aStringArray11 = new String[local42];
					this.anIntArray84 = new int[local42];
					this.anIntArray86 = new int[local42];
					this.anIntArray85 = new int[local42];
					for (local49 = 0; local49 < local42; local49++) {
						this.anIntArray86[local49] = arg1.method8527();
						this.anIntArray84[local49] = arg1.method8527();
						this.anIntArray85[local49] = arg1.method8527();
						this.aStringArray11[local49] = arg1.method8497();
					}
				} else if (arg0 == 19) {
					local42 = arg1.method8529();
					this.aStringArray12 = new String[local42];
					this.anIntArray80 = new int[local42];
					this.anIntArray78 = new int[local42];
					this.anIntArray81 = new int[local42];
					for (local49 = 0; local49 < local42; local49++) {
						this.anIntArray81[local49] = arg1.method8527();
						this.anIntArray80[local49] = arg1.method8527();
						this.anIntArray78[local49] = arg1.method8527();
						this.aStringArray12[local49] = arg1.method8497();
					}
				} else if (arg0 == 249) {
					local42 = arg1.method8529();
					if (this.aClass291_6 == null) {
						local49 = Static94.method1393(local42);
						this.aClass291_6 = new Class291(local49);
					}
					for (local49 = 0; local49 < local42; local49++) {
						@Pc(408) boolean local408 = arg1.method8529() == 1;
						@Pc(412) int local412 = arg1.method8510();
						@Pc(421) Class5 local421;
						if (local408) {
							local421 = new Class5_Sub42(arg1.method8497());
						} else {
							local421 = new Class5_Sub29(arg1.method8527());
						}
						this.aClass291_6.method6984((long) local412, local421);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!ib;)V")
	public void method1409(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 == 0) {
				return;
			}
			this.method1408(local5, arg0);
		}
	}
}
