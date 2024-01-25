import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class306 {

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "Lclient!pb;")
	private Class5 aClass5_236;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!pb;")
	public final Class5 aClass5_235 = new Class5();

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class306() {
		this.aClass5_235.aClass5_300 = this.aClass5_235;
		this.aClass5_235.aClass5_299 = this.aClass5_235;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Lclient!pb;")
	public Class5 method7301() {
		@Pc(11) Class5 local11 = this.aClass5_236;
		if (local11 == this.aClass5_235) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local11.aClass5_299;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)Lclient!pb;")
	public Class5 method7302() {
		@Pc(14) Class5 local14 = this.aClass5_235.aClass5_299;
		if (local14 == this.aClass5_235) {
			return null;
		} else {
			local14.method8911();
			return local14;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!pb;I)V")
	public void method7303(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_300 != null) {
			arg0.method8911();
		}
		arg0.aClass5_299 = this.aClass5_235;
		arg0.aClass5_300 = this.aClass5_235.aClass5_300;
		arg0.aClass5_300.aClass5_299 = arg0;
		arg0.aClass5_299.aClass5_300 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)Lclient!pb;")
	public Class5 method7304() {
		@Pc(7) Class5 local7 = this.aClass5_235.aClass5_300;
		if (this.aClass5_235 == local7) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local7.aClass5_300;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Lclient!pb;I)V")
	public void method7305(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_300 != null) {
			arg0.method8911();
		}
		arg0.aClass5_300 = this.aClass5_235;
		arg0.aClass5_299 = this.aClass5_235.aClass5_299;
		arg0.aClass5_300.aClass5_299 = arg0;
		arg0.aClass5_299.aClass5_300 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)I")
	public int method7306() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class5 local11 = this.aClass5_235.aClass5_299; local11 != this.aClass5_235; local11 = local11.aClass5_299) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ro;I)V")
	public void method7308(@OriginalArg(0) Class306 arg0) {
		this.method7311(this.aClass5_235.aClass5_299, arg0);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)Z")
	public boolean method7309() {
		return this.aClass5_235 == this.aClass5_235.aClass5_299;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!pb;ILclient!ro;)V")
	private void method7311(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class306 arg1) {
		@Pc(7) Class5 local7 = this.aClass5_235.aClass5_300;
		this.aClass5_235.aClass5_300 = arg0.aClass5_300;
		arg0.aClass5_300.aClass5_299 = this.aClass5_235;
		if (arg0 != this.aClass5_235) {
			arg0.aClass5_300 = arg1.aClass5_235.aClass5_300;
			arg0.aClass5_300.aClass5_299 = arg0;
			arg1.aClass5_235.aClass5_300 = local7;
			local7.aClass5_299 = arg1.aClass5_235;
		}
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)Lclient!pb;")
	public Class5 method7313() {
		@Pc(13) Class5 local13 = this.aClass5_235.aClass5_299;
		if (local13 == this.aClass5_235) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local13.aClass5_299;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)Lclient!pb;")
	public Class5 method7314() {
		@Pc(11) Class5 local11 = this.aClass5_236;
		if (this.aClass5_235 == local11) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local11.aClass5_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)V")
	public void method7315() {
		while (true) {
			@Pc(13) Class5 local13 = this.aClass5_235.aClass5_299;
			if (this.aClass5_235 == local13) {
				this.aClass5_236 = null;
				return;
			}
			local13.method8911();
		}
	}
}
