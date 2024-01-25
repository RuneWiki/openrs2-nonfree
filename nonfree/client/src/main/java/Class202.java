import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class202 {

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "Lclient!gg;")
	private final Class112 aClass112_35 = new Class112(16);

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "Lclient!kha;")
	private final Class181 aClass181_59;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class202(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_59 = arg2;
		this.aClass181_59.method5025(29);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lclient!pa;")
	private Class254 method5431(@OriginalArg(0) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_35;
		@Pc(18) Class254 local18;
		synchronized (this.aClass112_35) {
			local18 = (Class254) this.aClass112_35.method3640((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class181 local31 = this.aClass181_59;
		@Pc(42) byte[] local42;
		synchronized (this.aClass181_59) {
			local42 = this.aClass181_59.method5023(29, arg0);
		}
		local18 = new Class254();
		if (local42 != null) {
			local18.method6542(new Class3_Sub15(local42));
		}
		@Pc(64) Class112 local64 = this.aClass112_35;
		synchronized (this.aClass112_35) {
			this.aClass112_35.method3636((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public void method5432() {
		@Pc(2) Class112 local2 = this.aClass112_35;
		synchronized (this.aClass112_35) {
			this.aClass112_35.method3638();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIILclient!pq;)Lclient!im;")
	public Class147 method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class265 arg4) {
		@Pc(7) Class193[] local7 = null;
		@Pc(12) Class254 local12 = this.method5431(arg2);
		if (local12.anIntArray482 != null) {
			local7 = new Class193[local12.anIntArray482.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(39) Class197 local39 = arg4.method6689(local12.anIntArray482[local27]);
				local7[local27] = new Class193(local39.anInt6214, local39.anInt6208, local39.anInt6204, local39.anInt6209, local39.anInt6206, local39.anInt6211, local39.anInt6213, local39.aBoolean524);
			}
		}
		return new Class147(local12.anInt7811, local7, local12.anInt7808, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
	public void method5436() {
		@Pc(2) Class112 local2 = this.aClass112_35;
		synchronized (this.aClass112_35) {
			this.aClass112_35.method3643();
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V")
	public void method5438() {
		@Pc(6) Class112 local6 = this.aClass112_35;
		synchronized (this.aClass112_35) {
			this.aClass112_35.method3637(5);
		}
	}
}
