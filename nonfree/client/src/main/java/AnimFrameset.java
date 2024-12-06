import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class AnimFrameset extends DoublyLinkable {

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "[Lclient!ff;")
	public final AnimFrame[] aClass25Array1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ea;Lclient!ea;IZ)V")
	public AnimFrameset(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Js5Index arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) LinkList local7 = new LinkList();
		@Pc(12) int local12 = arg0.method591(arg2);
		this.aClass25Array1 = new AnimFrame[local12];
		@Pc(21) int[] local21 = arg0.method598(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) AnimBase local27 = null;
			@Pc(35) byte[] local35 = arg0.method597(arg2, local21[local23]);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) AnimBase local54 = (AnimBase) local7.method2025(); local54 != null; local54 = (AnimBase) local7.method2023()) {
				if (local49 == local54.anInt2018) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(84) byte[] local84 = arg1.method608(0, local49);
				local27 = new AnimBase(local49, local84);
				local7.method2028(local27);
			}
			this.aClass25Array1[local21[local23]] = new AnimFrame(local35, local27);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Z")
	public boolean method1702(@OriginalArg(0) int arg0) {
		return this.aClass25Array1[arg0].aBoolean93;
	}
}
