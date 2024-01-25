import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public abstract class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
	public int anInt10151;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
	public int anInt10152;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "Lclient!uq;")
	public Class9_Sub2 aClass9_Sub2_23;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
	public int anInt10154;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Z")
	public boolean aBoolean769;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
	public int anInt10155;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
	public int anInt10157;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
	public int anInt10158;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "Z")
	public boolean aBoolean770 = false;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	protected Class9_Sub2() {
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "(I)Z")
	public abstract boolean method8597();

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "(I)I")
	public int method8599() {
		return 0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLclient!ha;)V")
	public abstract void method8600(@OriginalArg(1) Class82 arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lclient!tj;B)I")
	public abstract int method8601(@OriginalArg(0) Class3_Sub22[] arg0);

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "(I)Z")
	public abstract boolean method8602();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	public abstract Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	public abstract Class160 method8604(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!ha;IB)Z")
	public abstract boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII[Lclient!tj;)I")
	protected final int method8606(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub22[] arg2) {
		@Pc(19) long local19 = Static387.aLongArrayArrayArray1[this.aByte127][arg0][arg1];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local19 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			local21 += 16L;
			arg2[local23++] = Static209.aClass339Array1[local33 - 1].aClass3_Sub22_3;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg2[local33] = null;
		}
		return local23;
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "(I)Z")
	public abstract boolean method8607();

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(Lclient!ha;B)Z")
	public abstract boolean method8608(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	public abstract void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)Z")
	public abstract boolean method8610();

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)I")
	public abstract int method8611(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "(I)V")
	public abstract void method8612();

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "(I)I")
	public abstract int method8613();
}
