import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "Lclient!h;")
	public static final Class89 aClass89_39 = new Class89(34, 15);

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "[I")
	public static final int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_1;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_2;

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_3;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_4;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_5;

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_6;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_7;

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_8;

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_9;

	@OriginalMember(owner = "client!ck", name = "S", descriptor = "Lclient!vr;")
	public static final Class242 aClass242_10;

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "[Lclient!vr;")
	private static final Class242[] aClass242Array1;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "Lclient!ad;")
	private Class4 aClass4_20;

	static {
		new Class79("Select", "Auswählen", "Sélectionner", "Selecionar");
		aClass242_1 = new Class242(14, 1);
		aClass242_2 = new Class242(15, 4);
		aClass242_3 = new Class242(16, -2);
		aClass242_4 = new Class242(17, 0);
		aClass242_5 = new Class242(18, -2);
		aClass242_6 = new Class242(20, 6);
		aClass242_7 = new Class242(21, 8);
		aClass242_8 = new Class242(22, -2);
		aClass242_9 = new Class242(23, 4);
		aClass242_10 = new Class242(24, -1);
		aClass242Array1 = new Class242[32];
		@Pc(80) Class242[] local80 = Static168.method3372();
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			aClass242Array1[local80[local82].anInt7025] = local80[local82];
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!bt;I)V", line = 4)
	private void method1342(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(23) int local23 = arg0.method4816();
		@Pc(30) int local30;
		if (this.aClass4_20 == null) {
			local30 = Static152.method2978(local23);
			this.aClass4_20 = new Class4(local30);
		}
		for (local30 = 0; local30 < local23; local30++) {
			@Pc(49) boolean local49 = arg0.method4816() == 1;
			@Pc(53) int local53 = arg0.method4834();
			@Pc(62) Class2 local62;
			if (local49) {
				local62 = new Class2_Sub40(arg0.method4810());
			} else {
				local62 = new Class2_Sub39(arg0.method4837());
			}
			this.aClass4_20.method87(local62, (long) local53);
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)I", line = 51)
	public int method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass4_20 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub39 local16 = (Class2_Sub39) this.aClass4_20.method90((long) arg0);
			return local16 == null ? arg1 : local16.anInt6805;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!bt;B)V", line = 100)
	public void method1345(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4816();
			if (local16 == 0) {
				return;
			}
			this.method1342(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 136)
	public String method1346(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass4_20 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub40 local16 = (Class2_Sub40) this.aClass4_20.method90((long) arg0);
			return local16 == null ? arg1 : local16.aString65;
		}
	}
}
