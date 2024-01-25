import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public final class Class294 {

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "Lclient!mq;")
	public Interface16 anInterface16_7;

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "Lclient!mq;")
	public Interface16 anInterface16_8;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "Z")
	public boolean aBoolean610;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "Z")
	public boolean aBoolean611;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Z)V")
	public Class294(@OriginalArg(0) boolean arg0) {
		this.aBoolean611 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
	public void method7174() {
		if (this.anInterface16_8 != null) {
			this.anInterface16_8.method7866();
		}
		this.aBoolean610 = false;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)Z")
	public boolean method7176() {
		return this.aBoolean610 && !this.aBoolean611;
	}
}
