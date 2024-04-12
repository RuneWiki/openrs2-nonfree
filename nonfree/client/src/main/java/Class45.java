import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class Class45 {

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	public static int[] anIntArray469 = new int[100];

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_613 = Static12.method257(" with @yel@");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_614 = Static12.method257("You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
	public static int[] anIntArray470 = new int[128];

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!ba;")
	public static Class6 aClass6_5 = new Class6(32);

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_616 = Static12.method257("Loading config )2 ");

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_615 = Static12.method257("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage5;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	protected int anInt2148;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	protected int anInt2152;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
	public int[] anIntArray471;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 136)
	public final void method1476() {
		Static25.method1604(this.anIntArray471, this.anInt2148, this.anInt2152);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1473(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1474(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
