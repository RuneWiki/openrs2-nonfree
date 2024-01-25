import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public abstract class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "B")
	public byte aByte117;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public int anInt9439;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "B")
	public byte aByte118;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public int anInt9440;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public int anInt9441;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public int anInt9442;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
	public int anInt9443;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
	public int anInt9444;

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	protected Class41_Sub2() {
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)Z")
	public abstract boolean method7837();

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!r;III)Z")
	public abstract boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)Z")
	public abstract boolean method7839();

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	public abstract void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)Z")
	public abstract boolean method7841();

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)I")
	public abstract int method7842(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	public abstract Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0);

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)I")
	public abstract int method7844();

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	public abstract Class189 method7845(@OriginalArg(0) Class45 arg0);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[Lclient!eq;)I")
	public abstract int method7846(@OriginalArg(1) Class3_Sub10[] arg0);

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)Z")
	public abstract boolean method7847();

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[Lclient!eq;I)I")
	protected final int method7848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub10[] arg2) {
		@Pc(14) long local14 = Static473.aLongArrayArrayArray1[this.aByte117][arg0][arg1];
		@Pc(16) long local16 = 0L;
		@Pc(26) int local26 = 0;
		@Pc(36) int local36;
		while (local16 <= 48L) {
			local36 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local36 <= 0) {
				break;
			}
			local16 += 16L;
			arg2[local26++] = Static169.aClass129Array1[local36 - 1].aClass3_Sub10_2;
		}
		for (local36 = local26; local36 < 4; local36++) {
			arg2[local36] = null;
		}
		return local26;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!r;Z)V")
	public abstract void method7849(@OriginalArg(0) Class45 arg0);

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)Z")
	public abstract boolean method7851();

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "(I)V")
	public abstract void method7852();
}
