import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class98 {

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "Lclient!te;")
	private Class8 aClass8_24;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "Lclient!te;")
	private final Class8 aClass8_23 = new Class8();

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
	public Class98() {
		this.aClass8_23.aClass8_68 = this.aClass8_23;
		this.aClass8_23.aClass8_67 = this.aClass8_23;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)I")
	public int method1776() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class8 local18 = this.aClass8_23.aClass8_68; local18 != this.aClass8_23; local18 = local18.aClass8_68) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)Lclient!te;")
	public Class8 method1777() {
		@Pc(13) Class8 local13 = this.aClass8_23.aClass8_68;
		if (local13 == this.aClass8_23) {
			this.aClass8_24 = null;
			return null;
		} else {
			this.aClass8_24 = local13.aClass8_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public void method1778() {
		while (true) {
			@Pc(14) Class8 local14 = this.aClass8_23.aClass8_68;
			if (this.aClass8_23 == local14) {
				this.aClass8_24 = null;
				return;
			}
			local14.method8893();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!te;)V")
	public void method1780(@OriginalArg(1) Class8 arg0) {
		if (arg0.aClass8_67 != null) {
			arg0.method8893();
		}
		arg0.aClass8_67 = this.aClass8_23.aClass8_67;
		arg0.aClass8_68 = this.aClass8_23;
		arg0.aClass8_67.aClass8_68 = arg0;
		arg0.aClass8_68.aClass8_67 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)Z")
	public boolean method1781() {
		return this.aClass8_23 == this.aClass8_23.aClass8_68;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)Lclient!te;")
	public Class8 method1782() {
		@Pc(12) Class8 local12 = this.aClass8_24;
		if (local12 == this.aClass8_23) {
			this.aClass8_24 = null;
			return null;
		} else {
			this.aClass8_24 = local12.aClass8_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)Lclient!te;")
	public Class8 method1784() {
		@Pc(15) Class8 local15 = this.aClass8_23.aClass8_68;
		if (this.aClass8_23 == local15) {
			return null;
		} else {
			local15.method8893();
			return local15;
		}
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(B)Lclient!te;")
	public Class8 method1785() {
		@Pc(13) Class8 local13 = this.aClass8_23.aClass8_67;
		if (local13 == this.aClass8_23) {
			this.aClass8_24 = null;
			return null;
		} else {
			this.aClass8_24 = local13.aClass8_67;
			return local13;
		}
	}
}
