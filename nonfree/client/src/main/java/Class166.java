import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class166 {

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!vba;")
	public Class338 aClass338_2;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public int anInt5085;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	private int anInt5086;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
	public int anInt5088;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!ek;)V")
	private void method3956(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt5086 = arg1.method7054();
		} else if (arg0 == 2) {
			this.anInt5088 = arg1.method7004();
			this.anInt5085 = arg1.method7004();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ek;B)V")
	public void method3957(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7004();
			if (local9 == 0) {
				return;
			}
			this.method3956(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Lclient!fda;")
	public synchronized Class103 method3958() {
		@Pc(15) Class103 local15 = (Class103) this.aClass338_2.aClass167_63.method3966((long) this.anInt5086);
		if (local15 != null) {
			return local15;
		}
		local15 = Static598.method2462(this.aClass338_2.aClass348_122, this.anInt5086, 0);
		if (local15 != null) {
			this.aClass338_2.aClass167_63.method3974((long) this.anInt5086, local15);
		}
		return local15;
	}
}
