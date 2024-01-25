import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public abstract class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	public int anInt9614;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public int anInt9615;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Z")
	public boolean aBoolean670;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public int anInt9617;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Lclient!fq;")
	public Class34_Sub1 aClass34_Sub1_23;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "B")
	public byte aByte131;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
	public int anInt9619;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "B")
	public byte aByte132;

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
	public int anInt9622;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
	public int anInt9623;

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Z")
	public boolean aBoolean671 = false;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	protected Class34_Sub1() {
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	public abstract Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0);

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)Z")
	public abstract boolean method7836();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB[Lclient!uaa;I)I")
	protected final int method7838(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub13[] arg1, @OriginalArg(3) int arg2) {
		@Pc(19) long local19 = Static231.aLongArrayArrayArray3[this.aByte132][arg2][arg0];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local19 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			arg1[local23++] = Static192.aClass165Array1[local33 - 1].aClass3_Sub13_1;
			local21 += 16L;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg1[local33] = null;
		}
		return local23;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(Z)I")
	public abstract int method7840(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)Z")
	public abstract boolean method7841();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	public abstract void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)I")
	public int method7844() {
		return 0;
	}

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "(I)Z")
	public abstract boolean method7845();

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	public abstract Class214 method7846(@OriginalArg(0) Class95 arg0);

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(B)I")
	public abstract int method7847();

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "(I)V")
	public abstract void method7848();

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(Lclient!ha;B)V")
	public abstract void method7849(@OriginalArg(0) Class95 arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!ha;II)Z")
	public abstract boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B[Lclient!uaa;)I")
	public abstract int method7851(@OriginalArg(1) Class3_Sub13[] arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!ha;Z)Z")
	public abstract boolean method7852(@OriginalArg(0) Class95 arg0);

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "(I)Z")
	public abstract boolean method7853();
}
