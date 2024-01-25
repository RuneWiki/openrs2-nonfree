import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class335 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!gg;")
	private final Class112 aClass112_61 = new Class112(64);

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!kha;")
	private final Class181 aClass181_116;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
	public final int anInt9684;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class335(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_116 = arg2;
		if (this.aClass181_116 == null) {
			this.anInt9684 = 0;
		} else {
			this.anInt9684 = this.aClass181_116.method5025(16);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	public void method7998() {
		@Pc(2) Class112 local2 = this.aClass112_61;
		synchronized (this.aClass112_61) {
			this.aClass112_61.method3637(5);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
	public void method7999() {
		@Pc(6) Class112 local6 = this.aClass112_61;
		synchronized (this.aClass112_61) {
			this.aClass112_61.method3638();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public void method8001() {
		@Pc(2) Class112 local2 = this.aClass112_61;
		synchronized (this.aClass112_61) {
			this.aClass112_61.method3643();
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)Lclient!jc;")
	public Class155 method8003(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_61;
		@Pc(21) Class155 local21;
		synchronized (this.aClass112_61) {
			local21 = (Class155) this.aClass112_61.method3640((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class181 local34 = this.aClass181_116;
		@Pc(43) byte[] local43;
		synchronized (this.aClass181_116) {
			local43 = this.aClass181_116.method5023(16, arg0);
		}
		local21 = new Class155();
		if (local43 != null) {
			local21.method4774(new Class3_Sub15(local43));
		}
		@Pc(65) Class112 local65 = this.aClass112_61;
		synchronized (this.aClass112_61) {
			this.aClass112_61.method3636((long) arg0, local21);
			return local21;
		}
	}
}
