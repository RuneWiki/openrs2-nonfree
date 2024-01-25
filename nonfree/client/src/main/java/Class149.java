import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class149 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	public int anInt4190;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	public int anInt4192;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public int anInt4193;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public int anInt4197;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public int anInt4198;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public int anInt4199;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public int anInt4200;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
	public int anInt4201;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	public int anInt4202;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	public int anInt4203;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	public int anInt4204;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	public int anInt4205;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!hr;)Z")
	public boolean method3479(@OriginalArg(1) Class149 arg0) {
		return this.anInt4200 == arg0.anInt4200 && this.anInt4198 == arg0.anInt4198 && arg0.anInt4204 == this.anInt4204;
	}
}
