import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class183 {

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!faa;")
	private Class3 aClass3_162;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!faa;")
	public final Class3 aClass3_161 = new Class3();

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class183() {
		this.aClass3_161.aClass3_288 = this.aClass3_161;
		this.aClass3_161.aClass3_287 = this.aClass3_161;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lclient!faa;")
	public Class3 method4786() {
		@Pc(7) Class3 local7 = this.aClass3_161.aClass3_287;
		if (this.aClass3_161 == local7) {
			this.aClass3_162 = null;
			return null;
		} else {
			this.aClass3_162 = local7.aClass3_287;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!faa;)V")
	public void method4787(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_287 != null) {
			arg0.method8412();
		}
		arg0.aClass3_288 = this.aClass3_161.aClass3_288;
		arg0.aClass3_287 = this.aClass3_161;
		arg0.aClass3_287.aClass3_288 = arg0;
		arg0.aClass3_288.aClass3_287 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ki;)V")
	public void method4789(@OriginalArg(1) Class183 arg0) {
		this.method4796(this.aClass3_161.aClass3_288, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public void method4790() {
		while (true) {
			@Pc(3) Class3 local3 = this.aClass3_161.aClass3_288;
			if (this.aClass3_161 == local3) {
				this.aClass3_162 = null;
				return;
			}
			local3.method8412();
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)Lclient!faa;")
	public Class3 method4791() {
		@Pc(6) Class3 local6 = this.aClass3_162;
		if (this.aClass3_161 == local6) {
			this.aClass3_162 = null;
			return null;
		} else {
			this.aClass3_162 = local6.aClass3_287;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!faa;I)V")
	public void method4792(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_287 != null) {
			arg0.method8412();
		}
		arg0.aClass3_288 = this.aClass3_161;
		arg0.aClass3_287 = this.aClass3_161.aClass3_287;
		arg0.aClass3_287.aClass3_288 = arg0;
		arg0.aClass3_288.aClass3_287 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Lclient!faa;")
	public Class3 method4793() {
		@Pc(6) Class3 local6 = this.aClass3_162;
		if (local6 == this.aClass3_161) {
			this.aClass3_162 = null;
			return null;
		} else {
			this.aClass3_162 = local6.aClass3_288;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Lclient!faa;")
	public Class3 method4795() {
		@Pc(14) Class3 local14 = this.aClass3_161.aClass3_288;
		if (local14 == this.aClass3_161) {
			this.aClass3_162 = null;
			return null;
		} else {
			this.aClass3_162 = local14.aClass3_288;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!faa;ILclient!ki;)V")
	private void method4796(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class183 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_161.aClass3_287;
		this.aClass3_161.aClass3_287 = arg0.aClass3_287;
		arg0.aClass3_287.aClass3_288 = this.aClass3_161;
		if (this.aClass3_161 != arg0) {
			arg0.aClass3_287 = arg1.aClass3_161.aClass3_287;
			arg0.aClass3_287.aClass3_288 = arg0;
			arg1.aClass3_161.aClass3_287 = local7;
			local7.aClass3_288 = arg1.aClass3_161;
		}
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)Lclient!faa;")
	public Class3 method4797() {
		@Pc(12) Class3 local12 = this.aClass3_161.aClass3_288;
		if (this.aClass3_161 == local12) {
			return null;
		} else {
			local12.method8412();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)Z")
	public boolean method4798() {
		return this.aClass3_161 == this.aClass3_161.aClass3_288;
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)I")
	public int method4799() {
		@Pc(10) int local10 = 0;
		for (@Pc(14) Class3 local14 = this.aClass3_161.aClass3_288; local14 != this.aClass3_161; local14 = local14.aClass3_288) {
			local10++;
		}
		return local10;
	}
}
