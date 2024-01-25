import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class6_Sub7_Sub2 extends Class6_Sub7 {

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "B")
	private byte aByte85;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
	private int anInt5648 = -1;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!kj;I)V")
	@Override
	public void method8200(@OriginalArg(0) Class6_Sub29 arg0) {
		@Pc(9) Class200 local9 = arg0.aClass200Array1[this.anInt5648];
		local9.aString58 = this.aString65;
		local9.aByte80 = this.aByte85;
		local9.anInt5266 = this.anInt5647;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8201(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt5648 = arg0.method3018();
		this.aByte85 = arg0.method3027();
		this.anInt5647 = arg0.method3018();
		arg0.method3049();
		this.aString65 = arg0.method3046();
	}
}
