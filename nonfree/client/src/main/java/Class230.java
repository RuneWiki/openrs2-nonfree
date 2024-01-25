import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class230 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!jn;")
	private final Class167 aClass167_32 = new Class167(64);

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!vo;")
	private final Class348 aClass348_72;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class230(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_72 = arg2;
		this.aClass348_72.method7981(32);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lclient!on;")
	public Class252 method5247(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_32;
		@Pc(18) Class252 local18;
		synchronized (this.aClass167_32) {
			local18 = (Class252) this.aClass167_32.method3966((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class348 local31 = this.aClass348_72;
		@Pc(40) byte[] local40;
		synchronized (this.aClass348_72) {
			local40 = this.aClass348_72.method7964(arg0, 32);
		}
		local18 = new Class252();
		if (local40 != null) {
			local18.method5902(new Class4_Sub13(local40));
		}
		@Pc(62) Class167 local62 = this.aClass167_32;
		synchronized (this.aClass167_32) {
			this.aClass167_32.method3974((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public void method5248() {
		@Pc(11) Class167 local11 = this.aClass167_32;
		synchronized (this.aClass167_32) {
			this.aClass167_32.method3975();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V")
	public void method5250() {
		@Pc(12) Class167 local12 = this.aClass167_32;
		synchronized (this.aClass167_32) {
			this.aClass167_32.method3964(5);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public void method5251() {
		@Pc(11) Class167 local11 = this.aClass167_32;
		synchronized (this.aClass167_32) {
			this.aClass167_32.method3961();
		}
	}
}
