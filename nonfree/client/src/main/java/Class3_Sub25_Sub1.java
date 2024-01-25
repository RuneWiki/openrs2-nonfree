import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class3_Sub25_Sub1 extends Class3_Sub25 {

	@OriginalMember(owner = "client!ik", name = "Cb", descriptor = "Lclient!mu;")
	private Class157 aClass157_1;

	@OriginalMember(owner = "client!ik", name = "Qb", descriptor = "I")
	private int anInt3260;

	static {
		new Class174("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(Z)I")
	public int method2774() {
		@Pc(22) int local22 = super.aByteArray88[super.anInt4974++] - this.aClass157_1.method3701() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray88[super.anInt4974++] - this.aClass157_1.method3701() & 0xFF);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([II)V")
	public void method2775(@OriginalArg(0) int[] arg0) {
		this.aClass157_1 = new Class157(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "(B)Z")
	public boolean method2776() {
		@Pc(25) int local25 = super.aByteArray88[super.anInt4974] - this.aClass157_1.method3696() & 0xFF;
		return local25 >= 128;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I[BII)V")
	public void method2778(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray88[super.anInt4974++] - this.aClass157_1.method3701());
		}
	}

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "(II)I")
	public int method2779(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3260;
	}

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "(II)V")
	public void method2781(@OriginalArg(1) int arg0) {
		super.aByteArray88[super.anInt4974++] = (byte) (this.aClass157_1.method3701() + arg0);
	}

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "(II)I")
	public int method2783(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt3260 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt3260 & 0x7);
		this.anInt3260 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray88[local15++] & Static117.anIntArray100[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += super.aByteArray88[local15] & Static117.anIntArray100[local23];
		} else {
			local31 += super.aByteArray88[local15] >> local23 - arg0 & Static117.anIntArray100[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "(I)V")
	public void method2785() {
		this.anInt3260 = super.anInt4974 * 8;
	}

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "(I)V")
	public void method2786() {
		super.anInt4974 = (this.anInt3260 + 7) / 8;
	}
}
