import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class107 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public int anInt2861 = 64;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Z")
	public boolean aBoolean203 = false;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	public int anInt2862 = 64;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	public int anInt2866 = 2;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	public int anInt2865 = -1;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	public int anInt2867 = 1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!io;I)V")
	public void method2407(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4393();
			if (local5 == 0) {
				return;
			}
			this.method2408(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIILclient!io;)V")
	private void method2408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub20 arg2) {
		if (arg1 == 1) {
			this.anInt2865 = arg2.method4426();
			if (this.anInt2865 == 65535) {
				this.anInt2865 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2862 = arg2.method4426() + 1;
			this.anInt2861 = arg2.method4426() + 1;
		} else if (arg1 == 3) {
			arg2.method4432();
		} else if (arg1 == 4) {
			this.anInt2866 = arg2.method4393();
		} else if (arg1 == 5) {
			this.anInt2867 = arg2.method4393();
		} else if (arg1 == 6) {
			this.aBoolean203 = true;
		} else if (arg1 == 7) {
			this.aBoolean204 = true;
			return;
		}
	}
}
