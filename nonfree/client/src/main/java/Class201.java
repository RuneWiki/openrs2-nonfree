import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class201 {

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!jn;")
	private final Class167 aClass167_21 = new Class167(64);

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_63;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class201(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_63 = arg2;
		this.aClass348_63.method7981(31);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V")
	public void method4806() {
		@Pc(2) Class167 local2 = this.aClass167_21;
		synchronized (this.aClass167_21) {
			this.aClass167_21.method3975();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	public void method4807() {
		@Pc(12) Class167 local12 = this.aClass167_21;
		synchronized (this.aClass167_21) {
			this.aClass167_21.method3964(5);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public void method4808() {
		@Pc(2) Class167 local2 = this.aClass167_21;
		synchronized (this.aClass167_21) {
			this.aClass167_21.method3961();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lclient!ica;")
	public Class146 method4809(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_21;
		@Pc(18) Class146 local18;
		synchronized (this.aClass167_21) {
			local18 = (Class146) this.aClass167_21.method3966((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class348 local31 = this.aClass348_63;
		@Pc(40) byte[] local40;
		synchronized (this.aClass348_63) {
			local40 = this.aClass348_63.method7964(arg0, 31);
		}
		local18 = new Class146();
		if (local40 != null) {
			local18.method3417(new Class4_Sub13(local40));
		}
		@Pc(62) Class167 local62 = this.aClass167_21;
		synchronized (this.aClass167_21) {
			this.aClass167_21.method3974((long) arg0, local18);
			return local18;
		}
	}
}
