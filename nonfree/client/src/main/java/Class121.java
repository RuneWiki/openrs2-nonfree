import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class121 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "Lclient!jn;")
	private Class167 aClass167_10 = new Class167(128);

	@OriginalMember(owner = "client!gda", name = "m", descriptor = "Lclient!jn;")
	public Class167 aClass167_11 = new Class167(64);

	@OriginalMember(owner = "client!gda", name = "k", descriptor = "Lclient!vo;")
	public final Class348 aClass348_40;

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "Lclient!vo;")
	private final Class348 aClass348_39;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;Lclient!vo;)V")
	public Class121(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Class348 arg3) {
		this.aClass348_40 = arg3;
		this.aClass348_39 = arg2;
		this.aClass348_39.method7981(36);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)Lclient!rca;")
	public Class288 method2676(@OriginalArg(0) int arg0) {
		@Pc(12) Class167 local12 = this.aClass167_10;
		@Pc(22) Class288 local22;
		synchronized (this.aClass167_10) {
			local22 = (Class288) this.aClass167_10.method3966((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class348 local35 = this.aClass348_39;
		@Pc(44) byte[] local44;
		synchronized (this.aClass348_39) {
			local44 = this.aClass348_39.method7964(arg0, 36);
		}
		local22 = new Class288();
		local22.aClass121_2 = this;
		local22.anInt8575 = arg0;
		if (local44 != null) {
			local22.method6634(new Class4_Sub13(local44));
		}
		local22.method6636();
		@Pc(75) Class167 local75 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3974((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BII)V")
	public void method2679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass167_10 = new Class167(arg1);
		this.aClass167_11 = new Class167(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	public void method2680() {
		@Pc(6) Class167 local6 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3975();
		}
		local6 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3975();
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)V")
	public void method2681() {
		@Pc(6) Class167 local6 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3964(5);
		}
		local6 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3964(5);
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)V")
	public void method2683() {
		@Pc(6) Class167 local6 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3961();
		}
		local6 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3961();
		}
	}
}
