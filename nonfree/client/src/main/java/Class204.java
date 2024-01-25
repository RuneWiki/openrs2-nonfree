import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class204 {

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[Lclient!si;")
	private Class113_Sub1[] aClass113_Sub1Array2;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!nj;")
	private Class1_Sub21 aClass1_Sub21_8;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!p;")
	private final Class154 aClass154_3;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!ro;")
	private final Class178 aClass178_3;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!sf;")
	private Class1_Sub2_Sub10_Sub2 aClass1_Sub2_Sub10_Sub2_2;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!p;Lclient!ro;)V")
	public Class204(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class178 arg1) {
		this.aClass154_3 = arg0;
		this.aClass178_3 = arg1;
		if (!this.aClass154_3.method4101()) {
			this.aClass1_Sub2_Sub10_Sub2_2 = this.aClass154_3.method4100(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
	public boolean method5501() {
		if (this.aClass1_Sub21_8 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub10_Sub2_2 == null) {
			if (this.aClass154_3.method4101()) {
				return false;
			}
			this.aClass1_Sub2_Sub10_Sub2_2 = this.aClass154_3.method4100(255, (byte) 0, true, 255);
		}
		if (this.aClass1_Sub2_Sub10_Sub2_2.aBoolean471) {
			return false;
		} else {
			this.aClass1_Sub21_8 = new Class1_Sub21(this.aClass1_Sub2_Sub10_Sub2_2.method4947());
			this.aClass113_Sub1Array2 = new Class113_Sub1[(this.aClass1_Sub21_8.aByteArray82.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!v;IILclient!v;)Lclient!si;")
	public Class113_Sub1 method5502(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class203 arg2) {
		return this.method5504(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!v;Lclient!v;IB)Lclient!si;")
	private Class113_Sub1 method5504(@OriginalArg(1) Class203 arg0, @OriginalArg(2) Class203 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass1_Sub21_8 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub21_8.anInt6611 = arg2 * 8 + 5;
		if (this.aClass1_Sub21_8.aByteArray82.length <= this.aClass1_Sub21_8.anInt6611) {
			throw new RuntimeException();
		} else if (this.aClass113_Sub1Array2[arg2] == null) {
			@Pc(45) int local45 = this.aClass1_Sub21_8.method5716();
			@Pc(61) int local61 = this.aClass1_Sub21_8.method5716();
			@Pc(75) Class113_Sub1 local75 = new Class113_Sub1(arg2, arg0, arg1, this.aClass154_3, this.aClass178_3, local45, local61, true);
			this.aClass113_Sub1Array2[arg2] = local75;
			return local75;
		} else {
			return this.aClass113_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public void method5505() {
		if (this.aClass113_Sub1Array2 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.aClass113_Sub1Array2.length; local14++) {
			if (this.aClass113_Sub1Array2[local14] != null) {
				this.aClass113_Sub1Array2[local14].method4978();
			}
		}
		for (@Pc(39) int local39 = 0; local39 < this.aClass113_Sub1Array2.length; local39++) {
			if (this.aClass113_Sub1Array2[local39] != null) {
				this.aClass113_Sub1Array2[local39].method4977();
			}
		}
	}
}
