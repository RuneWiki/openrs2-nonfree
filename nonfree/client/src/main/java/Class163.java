import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class163 {

	@OriginalMember(owner = "client!kba", name = "s", descriptor = "Lclient!gda;")
	private Class6 aClass6_179;

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "Lclient!gda;")
	public final Class6 aClass6_178 = new Class6();

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V")
	public Class163() {
		this.aClass6_178.aClass6_299 = this.aClass6_178;
		this.aClass6_178.aClass6_300 = this.aClass6_178;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)Lclient!gda;")
	public Class6 method4964() {
		@Pc(14) Class6 local14 = this.aClass6_179;
		if (local14 == this.aClass6_178) {
			this.aClass6_179 = null;
			return null;
		} else {
			this.aClass6_179 = local14.aClass6_299;
			return local14;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Lclient!gda;")
	public Class6 method4965() {
		@Pc(13) Class6 local13 = this.aClass6_179;
		if (this.aClass6_178 == local13) {
			this.aClass6_179 = null;
			return null;
		} else {
			this.aClass6_179 = local13.aClass6_300;
			return local13;
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)Lclient!gda;")
	public Class6 method4966() {
		@Pc(12) Class6 local12 = this.aClass6_178.aClass6_300;
		if (this.aClass6_178 == local12) {
			this.aClass6_179 = null;
			return null;
		} else {
			this.aClass6_179 = local12.aClass6_300;
			return local12;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!gda;I)V")
	public void method4967(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_299 != null) {
			arg0.method8792();
		}
		arg0.aClass6_299 = this.aClass6_178.aClass6_299;
		arg0.aClass6_300 = this.aClass6_178;
		arg0.aClass6_299.aClass6_300 = arg0;
		arg0.aClass6_300.aClass6_299 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)Z")
	public boolean method4968() {
		return this.aClass6_178 == this.aClass6_178.aClass6_300;
	}

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)Lclient!gda;")
	public Class6 method4969() {
		@Pc(7) Class6 local7 = this.aClass6_178.aClass6_300;
		if (this.aClass6_178 == local7) {
			return null;
		} else {
			local7.method8792();
			return local7;
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)V")
	public void method4970() {
		while (true) {
			@Pc(9) Class6 local9 = this.aClass6_178.aClass6_300;
			if (local9 == this.aClass6_178) {
				this.aClass6_179 = null;
				return;
			}
			local9.method8792();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!gda;)V")
	public void method4971(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_299 != null) {
			arg0.method8792();
		}
		arg0.aClass6_299 = this.aClass6_178;
		arg0.aClass6_300 = this.aClass6_178.aClass6_300;
		arg0.aClass6_299.aClass6_300 = arg0;
		arg0.aClass6_300.aClass6_299 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)I")
	public int method4972() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class6 local11 = this.aClass6_178.aClass6_300; local11 != this.aClass6_178; local11 = local11.aClass6_300) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!kba;I)V")
	public void method4973(@OriginalArg(0) Class163 arg0) {
		this.method4974(arg0, this.aClass6_178.aClass6_300);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!kba;Lclient!gda;B)V")
	private void method4974(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class6 arg1) {
		@Pc(14) Class6 local14 = this.aClass6_178.aClass6_299;
		this.aClass6_178.aClass6_299 = arg1.aClass6_299;
		arg1.aClass6_299.aClass6_300 = this.aClass6_178;
		if (arg1 != this.aClass6_178) {
			arg1.aClass6_299 = arg0.aClass6_178.aClass6_299;
			arg1.aClass6_299.aClass6_300 = arg1;
			arg0.aClass6_178.aClass6_299 = local14;
			local14.aClass6_300 = arg0.aClass6_178;
		}
	}

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "(I)Lclient!gda;")
	public Class6 method4975() {
		@Pc(12) Class6 local12 = this.aClass6_178.aClass6_299;
		if (this.aClass6_178 == local12) {
			this.aClass6_179 = null;
			return null;
		} else {
			this.aClass6_179 = local12.aClass6_299;
			return local12;
		}
	}
}
