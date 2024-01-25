import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public int anInt9996;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "Lclient!oq;")
	public Class2_Sub1 aClass2_Sub1_22;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "Z")
	public boolean aBoolean701;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
	public int anInt10001;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
	public int anInt10004;

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
	public int anInt10005;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "B")
	public byte aByte140;

	@OriginalMember(owner = "client!oq", name = "D", descriptor = "B")
	public byte aByte141;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
	public int anInt10006;

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "I")
	public int anInt10007;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "Z")
	public boolean aBoolean702 = false;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	protected Class2_Sub1() {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!ha;II)Z")
	public abstract boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)I")
	protected abstract int method8442();

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)I")
	public int method8443() {
		return 0;
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(B)I")
	public abstract int method8444();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!ha;B)Z")
	public abstract boolean method8445(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)Z")
	public abstract boolean method8446();

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)Z")
	public abstract boolean method8447();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	public abstract Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0);

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "(B)V")
	public abstract void method8449();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z[Lclient!sca;)I")
	public abstract int method8450(@OriginalArg(1) Class6_Sub17[] arg0);

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(Z)Z")
	public abstract boolean method8451();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[Lclient!sca;II)I")
	protected final int method8452(@OriginalArg(1) Class6_Sub17[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static371.aLongArrayArrayArray1[this.aByte140][arg2][arg1];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg0[local18++] = Static193.aClass394Array1[local28 - 1].aClass6_Sub17_3;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg0[local28] = null;
		}
		return local18;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(Lclient!ha;I)V")
	public abstract void method8458(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	public abstract Class338 method8459(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)Z")
	public abstract boolean method8461();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	public abstract void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5);
}
