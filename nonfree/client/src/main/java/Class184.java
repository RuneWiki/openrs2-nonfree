import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class Class184 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)[B")
	public abstract byte[] method3812();

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([BI)V")
	public abstract void method3814(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(III)[B")
	public abstract byte[] method3815(@OriginalArg(0) int arg0);
}
