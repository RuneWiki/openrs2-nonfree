import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class82 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!mha;")
	public Interface16 anInterface16_7;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!mha;")
	public Interface16 anInterface16_8;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "Z")
	public boolean aBoolean192;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Z)V")
	public Class82(@OriginalArg(0) boolean arg0) {
		this.aBoolean192 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method2087() {
		if (this.anInterface16_7 != null) {
			this.anInterface16_7.method7731();
		}
		this.aBoolean191 = false;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)Z")
	public boolean method2092() {
		return this.aBoolean191 && !this.aBoolean192;
	}
}
