import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class369 {

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	public int anInt10375;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
	public int anInt10376;

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
	public int anInt10377;

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
	public int anInt10378;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	public int anInt10379;

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
	public int anInt10381;

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
	public int anInt10382;

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
	public int anInt10384;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
	public int anInt10385;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
	public int anInt10386;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public int anInt10387;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
	public int anInt10388;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!uw;)Z")
	public boolean method8882(@OriginalArg(1) Class369 arg0) {
		return this.anInt10384 == arg0.anInt10384 && this.anInt10387 == arg0.anInt10387 && this.anInt10377 == arg0.anInt10377;
	}
}
