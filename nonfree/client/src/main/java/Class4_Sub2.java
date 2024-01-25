import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	public int anInt10228;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "B")
	public byte aByte133;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
	public int anInt10229;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "Z")
	public boolean aBoolean885;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "B")
	public byte aByte134;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public int anInt10232;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	public int anInt10233;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
	public int anInt10234;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "Lclient!tl;")
	public Class4_Sub2 aClass4_Sub2_25;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	public int anInt10236;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "Z")
	public boolean aBoolean887 = false;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	protected Class4_Sub2() {
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Z")
	public abstract boolean method8964();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III[Lclient!bba;)I")
	protected final int method8965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub7[] arg2) {
		@Pc(14) long local14 = Static255.aLongArrayArrayArray1[this.aByte133][arg1][arg0];
		@Pc(24) long local24 = 0L;
		@Pc(26) int local26 = 0;
		@Pc(36) int local36;
		while (local24 <= 48L) {
			local36 = (int) (local14 >> (int) local24 & 0xFFFFL);
			if (local36 <= 0) {
				break;
			}
			arg2[local26++] = Static292.aClass248Array1[local36 - 1].aClass2_Sub7_3;
			local24 += 16L;
		}
		for (local36 = local26; local36 < 4; local36++) {
			arg2[local36] = null;
		}
		return local26;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	public abstract Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	public abstract void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6);

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)Z")
	public abstract boolean method8968();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([Lclient!bba;B)I")
	public abstract int method8969(@OriginalArg(0) Class2_Sub7[] arg0);

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(Z)Z")
	public abstract boolean method8970();

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	public abstract Class187 method8971(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method8972(@OriginalArg(1) Class145 arg0);

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)V")
	public abstract void method8973();

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(ILclient!ha;)V")
	public abstract void method8975(@OriginalArg(1) Class145 arg0);

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)Z")
	public abstract boolean method8976();

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)I")
	public abstract int method8977(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)I")
	protected abstract int method8978();

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)I")
	public int method8979(@OriginalArg(0) int arg0) {
		if (arg0 != 65535) {
			this.method8980((Class145) null, 32, -55, -116);
		}
		return 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ha;III)Z")
	public abstract boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
