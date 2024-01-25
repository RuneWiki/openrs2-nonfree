import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class252 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!nj;")
	private final Class171 aClass171_56 = new Class171(16);

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!mg;")
	private final Class160 aClass160_82;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class252(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_82 = arg2;
		this.aClass160_82.method3722(29);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIILclient!jk;II)Lclient!uf;")
	public Class242 method5608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class131 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class262[] local7 = null;
		@Pc(12) Class227 local12 = this.method5610(arg3);
		if (local12.anIntArray536 != null) {
			local7 = new Class262[local12.anIntArray536.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class229 local32 = arg2.method2954(local12.anIntArray536[local22]);
				local7[local22] = new Class262(local32.anInt6325, local32.anInt6332, local32.anInt6330, local32.anInt6329, local32.anInt6326, local32.anInt6328, local32.anInt6324, local32.aBoolean437);
			}
		}
		return new Class242(local12.anInt6297, local7, local12.anInt6299, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method5609() {
		@Pc(6) Class171 local6 = this.aClass171_56;
		synchronized (this.aClass171_56) {
			this.aClass171_56.method3936();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!sq;")
	private Class227 method5610(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_56;
		@Pc(16) Class227 local16;
		synchronized (this.aClass171_56) {
			local16 = (Class227) this.aClass171_56.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass160_82.method3696(arg0, 29);
		local16 = new Class227();
		if (local39 != null) {
			local16.method4994(new Class2_Sub23(local39));
		}
		@Pc(55) Class171 local55 = this.aClass171_56;
		synchronized (this.aClass171_56) {
			this.aClass171_56.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)V")
	public void method5611() {
		@Pc(7) Class171 local7 = this.aClass171_56;
		synchronized (this.aClass171_56) {
			this.aClass171_56.method3933(5);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public void method5613() {
		@Pc(6) Class171 local6 = this.aClass171_56;
		synchronized (this.aClass171_56) {
			this.aClass171_56.method3934();
		}
	}
}
