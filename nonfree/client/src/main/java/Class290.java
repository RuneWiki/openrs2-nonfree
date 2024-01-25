import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class290 {

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "Lclient!jn;")
	private final Class167 aClass167_45 = new Class167(64);

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_105;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
	public final int anInt8646;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class290(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_105 = arg2;
		if (this.aClass348_105 == null) {
			this.anInt8646 = 0;
		} else {
			this.anInt8646 = this.aClass348_105.method7981(16);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IB)Lclient!hf;")
	public Class137 method6668(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_45;
		@Pc(16) Class137 local16;
		synchronized (this.aClass167_45) {
			local16 = (Class137) this.aClass167_45.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) Class348 local40 = this.aClass348_105;
		@Pc(49) byte[] local49;
		synchronized (this.aClass348_105) {
			local49 = this.aClass348_105.method7964(arg0, 16);
		}
		local16 = new Class137();
		if (local49 != null) {
			local16.method3082(new Class4_Sub13(local49));
		}
		@Pc(71) Class167 local71 = this.aClass167_45;
		synchronized (this.aClass167_45) {
			this.aClass167_45.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
	public void method6671() {
		@Pc(2) Class167 local2 = this.aClass167_45;
		synchronized (this.aClass167_45) {
			this.aClass167_45.method3961();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
	public void method6673() {
		@Pc(2) Class167 local2 = this.aClass167_45;
		synchronized (this.aClass167_45) {
			this.aClass167_45.method3964(5);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
	public void method6674() {
		@Pc(6) Class167 local6 = this.aClass167_45;
		synchronized (this.aClass167_45) {
			this.aClass167_45.method3975();
		}
	}
}
