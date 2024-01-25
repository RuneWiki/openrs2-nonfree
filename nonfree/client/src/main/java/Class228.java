import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class228 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	public int anInt6250;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public int anInt6251;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public int anInt6253;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	public int anInt6254;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public int anInt6258;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public int anInt6252 = 16777215;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
	public int anInt6257 = 8;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!dt;)V")
	public void method5270(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method5271(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!dt;)V")
	private void method5271(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt6257 = arg1.method7951();
		} else if (arg0 == 2) {
			this.aBoolean437 = true;
		} else if (arg0 == 3) {
			this.anInt6250 = arg1.method7918();
			this.anInt6253 = arg1.method7918();
			this.anInt6258 = arg1.method7918();
		} else if (arg0 == 4) {
			this.anInt6251 = arg1.method7954();
		} else if (arg0 == 5) {
			this.anInt6254 = arg1.method7951();
		} else if (arg0 == 6) {
			this.anInt6252 = arg1.method7945();
		}
	}
}
