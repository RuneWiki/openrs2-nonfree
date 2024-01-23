import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class32 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	public int anInt1193;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public int anInt1194;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public int anInt1195;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public int anInt1196;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public int anInt1203 = 16777215;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public int anInt1197 = 8;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!oe;I)V")
	private void method889(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1197 = arg1.method2130();
		} else if (arg0 == 2) {
			this.aBoolean82 = true;
		} else if (arg0 == 3) {
			this.anInt1196 = arg1.method2191();
			this.anInt1194 = arg1.method2191();
			this.anInt1193 = arg1.method2191();
		} else if (arg0 == 4) {
			this.anInt1199 = arg1.method2146();
		} else if (arg0 == 5) {
			this.anInt1195 = arg1.method2130();
		} else if (arg0 == 6) {
			this.anInt1203 = arg1.method2166();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!oe;)V")
	public void method891(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2146();
			if (local9 == 0) {
				return;
			}
			this.method889(local9, arg1, arg0);
		}
	}
}
