import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class8 {

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "Lclient!efa;")
	private Class6 aClass6_8;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "Lclient!efa;")
	public final Class6 aClass6_7 = new Class6();

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	public Class8() {
		this.aClass6_7.aClass6_300 = this.aClass6_7;
		this.aClass6_7.aClass6_299 = this.aClass6_7;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!efa;B)V")
	public void method146(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_300 != null) {
			arg0.method9043();
		}
		arg0.aClass6_300 = this.aClass6_7;
		arg0.aClass6_299 = this.aClass6_7.aClass6_299;
		arg0.aClass6_300.aClass6_299 = arg0;
		arg0.aClass6_299.aClass6_300 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Lclient!efa;")
	public Class6 method148() {
		@Pc(13) Class6 local13 = this.aClass6_8;
		if (local13 == this.aClass6_7) {
			this.aClass6_8 = null;
			return null;
		} else {
			this.aClass6_8 = local13.aClass6_300;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)Lclient!efa;")
	public Class6 method149() {
		@Pc(7) Class6 local7 = this.aClass6_7.aClass6_299;
		if (local7 == this.aClass6_7) {
			this.aClass6_8 = null;
			return null;
		} else {
			this.aClass6_8 = local7.aClass6_299;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)I")
	public int method150() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class6 local16 = this.aClass6_7.aClass6_299;
		while (local16 != this.aClass6_7) {
			local16 = local16.aClass6_299;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "(I)Z")
	public boolean method151() {
		return this.aClass6_7 == this.aClass6_7.aClass6_299;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)Lclient!efa;")
	public Class6 method152() {
		@Pc(12) Class6 local12 = this.aClass6_7.aClass6_299;
		if (this.aClass6_7 == local12) {
			return null;
		} else {
			local12.method9043();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V")
	public void method154() {
		while (true) {
			@Pc(9) Class6 local9 = this.aClass6_7.aClass6_299;
			if (this.aClass6_7 == local9) {
				this.aClass6_8 = null;
				return;
			}
			local9.method9043();
		}
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)Lclient!efa;")
	public Class6 method155() {
		@Pc(13) Class6 local13 = this.aClass6_8;
		if (this.aClass6_7 == local13) {
			this.aClass6_8 = null;
			return null;
		} else {
			this.aClass6_8 = local13.aClass6_299;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!ada;I)V")
	public void method156(@OriginalArg(0) Class8 arg0) {
		this.method160(this.aClass6_7.aClass6_299, arg0);
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(Lclient!efa;B)V")
	public void method157(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_300 != null) {
			arg0.method9043();
		}
		arg0.aClass6_299 = this.aClass6_7;
		arg0.aClass6_300 = this.aClass6_7.aClass6_300;
		arg0.aClass6_300.aClass6_299 = arg0;
		arg0.aClass6_299.aClass6_300 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)Lclient!efa;")
	public Class6 method159() {
		@Pc(15) Class6 local15 = this.aClass6_7.aClass6_300;
		if (this.aClass6_7 == local15) {
			this.aClass6_8 = null;
			return null;
		} else {
			this.aClass6_8 = local15.aClass6_300;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!efa;BLclient!ada;)V")
	private void method160(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class8 arg1) {
		@Pc(7) Class6 local7 = this.aClass6_7.aClass6_300;
		this.aClass6_7.aClass6_300 = arg0.aClass6_300;
		arg0.aClass6_300.aClass6_299 = this.aClass6_7;
		if (this.aClass6_7 != arg0) {
			arg0.aClass6_300 = arg1.aClass6_7.aClass6_300;
			arg0.aClass6_300.aClass6_299 = arg0;
			arg1.aClass6_7.aClass6_300 = local7;
			local7.aClass6_299 = arg1.aClass6_7;
		}
	}
}
