import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class340 implements Interface27 {

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "Lclient!uw;")
	private final Class345 aClass345_1;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Lclient!cp;")
	private final Class59 aClass59_2;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!cp;Lclient!uw;)V")
	public Class340(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class345 arg1) {
		this.aClass345_1 = arg1;
		this.aClass59_2 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8108() {
		@Pc(17) Class148 local17 = this.aClass59_2.method1342(this.aClass345_1.anInt9645);
		if (local17 == null) {
			return;
		}
		@Pc(34) int local34 = this.aClass345_1.aClass293_12.method7212(Static623.anInt9971, this.aClass345_1.anInt9638) + this.aClass345_1.anInt9641;
		@Pc(48) int local48 = this.aClass345_1.aClass15_13.method259(this.aClass345_1.anInt9642, Static269.anInt5258) + this.aClass345_1.anInt9643;
		if (this.aClass345_1.aBoolean731) {
			Static266.aClass82_8.method6179(local34, local48, this.aClass345_1.anInt9638, this.aClass345_1.anInt9642, this.aClass345_1.anInt9636, 0);
		}
		local48 += this.method8110(local48, Static374.aClass63_9, local34, local17.aString32) * 12;
		local48 += 8;
		if (this.aClass345_1.aBoolean731) {
			Static266.aClass82_8.method6164(local34, local48, this.aClass345_1.anInt9638 + local34 - 1, local48, this.aClass345_1.anInt9636, 0);
		}
		local48++;
		local48 += this.method8110(local48, Static374.aClass63_9, local34, local17.aString31) * 12;
		local48 += 5;
		@Pc(130) int local130 = local48 + this.method8110(local48, Static374.aClass63_9, local34, local17.aString30) * 12;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return this.aClass59_2.method1343();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!da;IILjava/lang/String;I)I")
	private int method8110(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		return arg1.method7749(0, 0, 0, this.aClass345_1.anInt9633, (int[]) null, this.aClass345_1.anInt9642 - 10, (Class1) null, arg2 + 5, arg3, 0, this.aClass345_1.anInt9638 - 10, (Class103[]) null, this.aClass345_1.anInt9634, arg0 + 5, 0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
	@Override
	public void method8107() {
	}
}
