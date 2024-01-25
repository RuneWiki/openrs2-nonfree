import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "B")
	public byte aByte131;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	public int anInt10303;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!ga;")
	public Class3_Sub1 aClass3_Sub1_23;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public int anInt10305;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "B")
	public byte aByte132;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
	public int anInt10306;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public int anInt10309;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Z")
	public boolean aBoolean705;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
	public int anInt10310;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	public int anInt10311;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
	public boolean aBoolean706 = false;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	protected Class3_Sub1() {
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)Z")
	public abstract boolean method8600();

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Z")
	public abstract boolean method8601();

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)Z")
	public abstract boolean method8602();

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)I")
	public abstract int method8603(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	public abstract void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	public abstract Class142 method8605(@OriginalArg(0) Class20 arg0);

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)Z")
	public abstract boolean method8606();

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lclient!ab;I)I")
	public abstract int method8608(@OriginalArg(0) Class2_Sub1[] arg0);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	public abstract Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0);

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(Lclient!ha;I)V")
	public abstract void method8611(@OriginalArg(0) Class20 arg0);

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "(I)Z")
	public abstract boolean method8612();

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lclient!ab;III)I")
	protected final int method8614(@OriginalArg(0) Class2_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) long local20 = Static423.aLongArrayArrayArray1[this.aByte132][arg1][arg2];
		@Pc(22) long local22 = 0L;
		@Pc(24) int local24 = 0;
		@Pc(34) int local34;
		while (local22 <= 48L) {
			local34 = (int) (local20 >> (int) local22 & 0xFFFFL);
			if (local34 <= 0) {
				break;
			}
			arg0[local24++] = Static436.aClass300Array1[local34 - 1].aClass2_Sub1_2;
			local22 += 16L;
		}
		for (local34 = local24; local34 < 4; local34++) {
			arg0[local34] = null;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ha;III)Z")
	public abstract boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public abstract void method8616();

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "(I)I")
	public int method8617() {
		return 0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)I")
	public abstract int method8618();
}
