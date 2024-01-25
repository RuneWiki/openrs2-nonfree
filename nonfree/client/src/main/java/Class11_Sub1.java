import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public int anInt9925;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	public int anInt9928;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
	public int anInt9929;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "B")
	public byte aByte124;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
	public int anInt9930;

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
	public int anInt9931;

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
	public int anInt9932;

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Z")
	public boolean aBoolean732;

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "B")
	public byte aByte125;

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "Z")
	public boolean aBoolean731 = false;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	protected Class11_Sub1() {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	public abstract boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)Z")
	public abstract boolean method8302();

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "(B)I")
	public abstract int method8304(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(B)I")
	public int method8305() {
		return 0;
	}

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "(B)Z")
	public abstract boolean method8306();

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	public abstract Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	public abstract Class316 method8308(@OriginalArg(0) Class87 arg0);

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "(B)Z")
	public abstract boolean method8310();

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
	public abstract void method8311();

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(BLclient!ha;)V")
	public abstract void method8312(@OriginalArg(1) Class87 arg0);

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "(B)Z")
	public abstract boolean method8313();

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)Z")
	public abstract boolean method8314();

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)I")
	public abstract int method8315();

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	public abstract void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([Lclient!bh;BII)I")
	protected final int method8317(@OriginalArg(0) Class2_Sub4[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static192.aLongArrayArrayArray1[this.aByte124][arg1][arg2];
		@Pc(24) long local24 = 0L;
		@Pc(26) int local26 = 0;
		@Pc(36) int local36;
		while (local24 <= 48L) {
			local36 = (int) (local14 >> (int) local24 & 0xFFFFL);
			if (local36 <= 0) {
				break;
			}
			local24 += 16L;
			arg0[local26++] = Static302.aClass93Array1[local36 - 1].aClass2_Sub4_3;
		}
		for (local36 = local26; local36 < 4; local36++) {
			arg0[local36] = null;
		}
		return local26;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([Lclient!bh;I)I")
	public abstract int method8318(@OriginalArg(0) Class2_Sub4[] arg0);
}
