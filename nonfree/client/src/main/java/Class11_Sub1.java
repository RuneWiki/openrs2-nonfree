import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
	public int anInt8899;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
	public int anInt8900;

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
	public int anInt8902;

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
	public int anInt8906;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "Z")
	public boolean aBoolean666;

	@OriginalMember(owner = "client!vv", name = "u", descriptor = "B")
	public byte aByte112;

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
	public int anInt8908;

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "B")
	public byte aByte113;

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "I")
	public int anInt8909;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	protected Class11_Sub1() {
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[Lclient!tw;II)I")
	protected final int method7203(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) long local14 = Static121.aLongArrayArrayArray1[this.aByte113][arg2][arg0];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local14 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			local21 += 16L;
			arg1[local23++] = Static31.aClass49Array1[local33 - 1].aClass1_Sub24_1;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg1[local33] = null;
		}
		return local23;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([Lclient!tw;I)I")
	public abstract int method7204(@OriginalArg(0) Class1_Sub24[] arg0);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	public abstract Class48 method7205(@OriginalArg(1) Class78 arg0);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!r;Z)V")
	public abstract void method7206(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "(I)I")
	public abstract int method7208(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)Z")
	public abstract boolean method7209();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIILclient!r;)Z")
	public abstract boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2);

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)I")
	public abstract int method7212();

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "(I)Z")
	public abstract boolean method7214();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	public abstract void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "(I)Z")
	public abstract boolean method7216();

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "(B)Z")
	public abstract boolean method7217();

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	public abstract Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "(B)Z")
	public abstract boolean method7221();

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "(I)V")
	public abstract void method7222();
}
