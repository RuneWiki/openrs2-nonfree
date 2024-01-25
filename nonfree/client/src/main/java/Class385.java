import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class385 {

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Lclient!vk;")
	private Class60 aClass60_66;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "Lclient!vk;")
	private final Class60 aClass60_65 = new Class60();

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class385() {
		this.aClass60_65.aClass60_68 = this.aClass60_65;
		this.aClass60_65.aClass60_67 = this.aClass60_65;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)Lclient!vk;")
	public Class60 method8772() {
		@Pc(13) Class60 local13 = this.aClass60_65.aClass60_67;
		if (local13 == this.aClass60_65) {
			return null;
		} else {
			local13.method8914();
			return local13;
		}
	}

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)Lclient!vk;")
	public Class60 method8773() {
		@Pc(14) Class60 local14 = this.aClass60_66;
		if (local14 == this.aClass60_65) {
			this.aClass60_66 = null;
			return null;
		} else {
			this.aClass60_66 = local14.aClass60_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public void method8774() {
		while (true) {
			@Pc(9) Class60 local9 = this.aClass60_65.aClass60_67;
			if (local9 == this.aClass60_65) {
				this.aClass60_66 = null;
				return;
			}
			local9.method8914();
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)Z")
	public boolean method8775() {
		return this.aClass60_65.aClass60_67 == this.aClass60_65;
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)Lclient!vk;")
	public Class60 method8777() {
		@Pc(13) Class60 local13 = this.aClass60_65.aClass60_68;
		if (local13 == this.aClass60_65) {
			this.aClass60_66 = null;
			return null;
		} else {
			this.aClass60_66 = local13.aClass60_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)Lclient!vk;")
	public Class60 method8778() {
		@Pc(14) Class60 local14 = this.aClass60_65.aClass60_67;
		if (local14 == this.aClass60_65) {
			this.aClass60_66 = null;
			return null;
		} else {
			this.aClass60_66 = local14.aClass60_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!vk;I)V")
	public void method8779(@OriginalArg(0) Class60 arg0) {
		if (arg0.aClass60_68 != null) {
			arg0.method8914();
		}
		arg0.aClass60_68 = this.aClass60_65.aClass60_68;
		arg0.aClass60_67 = this.aClass60_65;
		arg0.aClass60_68.aClass60_67 = arg0;
		arg0.aClass60_67.aClass60_68 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)I")
	public int method8780() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class60 local11 = this.aClass60_65.aClass60_67;
		while (local11 != this.aClass60_65) {
			local11 = local11.aClass60_67;
			local7++;
		}
		return local7;
	}
}
