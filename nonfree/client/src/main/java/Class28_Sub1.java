import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public abstract class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	public int anInt10777;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	public int anInt10778;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "B")
	public byte aByte144;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "Lclient!lq;")
	public Class28_Sub1 aClass28_Sub1_23;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	public int anInt10779;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "B")
	public byte aByte145;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	public int anInt10781;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
	public int anInt10783;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "Z")
	public boolean aBoolean913;

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
	public int anInt10784;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "Z")
	public boolean aBoolean912 = false;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	protected Class28_Sub1() {
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!ha;I)Z")
	public abstract boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2);

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	public abstract void method8960();

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z")
	public abstract boolean method8961();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ha;I)V")
	public abstract void method8962(@OriginalArg(0) Class65 arg0);

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)Z")
	public abstract boolean method8963();

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(B)I")
	public abstract int method8964(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(Z)Z")
	public abstract boolean method8965();

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(B)I")
	public int method8966() {
		return 0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[Lclient!gu;II)I")
	protected final int method8967(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub18[] arg1, @OriginalArg(2) int arg2) {
		@Pc(26) long local26 = Static101.aLongArrayArrayArray1[this.aByte145][arg0][arg2];
		@Pc(28) long local28 = 0L;
		@Pc(30) int local30 = 0;
		@Pc(40) int local40;
		while (local28 <= 48L) {
			local40 = (int) (local26 >> (int) local28 & 0xFFFFL);
			if (local40 <= 0) {
				break;
			}
			arg1[local30++] = Static50.aClass199Array1[local40 - 1].aClass5_Sub18_2;
			local28 += 16L;
		}
		for (local40 = local30; local40 < 4; local40++) {
			arg1[local40] = null;
		}
		return local30;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	public abstract void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([Lclient!gu;I)I")
	public abstract int method8970(@OriginalArg(0) Class5_Sub18[] arg0);

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	public abstract Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0);

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z")
	public abstract boolean method8973();

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lclient!ha;I)Z")
	public abstract boolean method8974(@OriginalArg(0) Class65 arg0);

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I")
	public abstract int method8976();

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	public abstract Class160 method8978(@OriginalArg(1) Class65 arg0);
}
