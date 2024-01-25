import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class335 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
	public int anInt10093;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "Z")
	public boolean aBoolean692 = true;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!cea;B)V")
	public void method8408(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8383();
			if (local13 == 0) {
				return;
			}
			this.method8411(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Z")
	public boolean method8409() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZLclient!cea;I)V")
	private void method8411(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static172.method3629(arg0.method8384());
		} else if (arg1 == 2) {
			this.anInt10093 = arg0.method8381();
		} else if (arg1 == 4) {
			this.aBoolean692 = false;
		} else if (arg1 == 5) {
			this.aString102 = arg0.method8373();
		}
	}
}
