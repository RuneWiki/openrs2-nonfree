import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class386 {

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "Lclient!qw;")
	public final Class319 aClass319_13 = new Class319();

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "Z")
	public boolean aBoolean718 = false;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Z)V")
	public Class386(@OriginalArg(0) boolean arg0) {
		this.aBoolean718 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!nk;I)V")
	public void method8998(@OriginalArg(0) Class9_Sub6 arg0) {
		@Pc(8) Class9_Sub1 local8 = arg0.aClass9_Sub1_18;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class9_Sub9[] local13 = arg0.aClass9_Sub9Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean719) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(63) Class9_Sub6 local63;
		if (this.aBoolean718) {
			for (local63 = (Class9_Sub6) this.aClass319_13.method7195(); local63 != null; local63 = (Class9_Sub6) this.aClass319_13.method7188()) {
				if (local63.aClass9_Sub1_18 == local8) {
					local63.method9182();
					Static170.method2742(local63);
				}
			}
		}
		for (local63 = (Class9_Sub6) this.aClass319_13.method7195(); local63 != null; local63 = (Class9_Sub6) this.aClass319_13.method7188()) {
			if (local63.aClass9_Sub1_18.anInt10693 <= local8.anInt10693) {
				Static8.method248(local63, arg0);
				return;
			}
		}
		this.aClass319_13.method7196(arg0);
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V")
	public void method9000() {
		while (true) {
			@Pc(15) Class9_Sub6 local15 = (Class9_Sub6) this.aClass319_13.method7197();
			if (local15 == null) {
				return;
			}
			local15.method9182();
			Static170.method2742(local15);
		}
	}
}
